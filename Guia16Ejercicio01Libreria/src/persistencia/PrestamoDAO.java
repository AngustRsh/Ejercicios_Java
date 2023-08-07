/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.util.Date;
import java.util.List;

public class PrestamoDAO extends DAO<Prestamo> {

    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    public void eliminar(Integer id) throws Exception {
        Prestamo prestamo = buscarPorId(id);
        super.eliminar(prestamo);
    }

    public Prestamo buscarPorId(Integer id) throws Exception {
        conectarBase();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectarBase();
        return prestamo;
    }

    public List<Prestamo> buscarPorCliente(Cliente cliente) {
        conectarBase();
        try {
            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente = :cliente", Prestamo.class)
                    .setParameter("cliente", cliente).getResultList();
            return prestamos;
        } finally {
            desconectarBase();
        }
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        conectarBase();
        em.getTransaction().begin();
        em.merge(prestamo);
        em.getTransaction().commit();
        desconectarBase();
    }

    public List<Prestamo> buscarPrestamosActivosPorLibro(Libro libro) {
        conectarBase();
        try {
            List<Prestamo> prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.libro = :libro AND p.devuelto = false", Prestamo.class)
                    .setParameter("libro", libro).getResultList();
            return prestamos;
        } finally {
            desconectarBase();
        }
    }

    public void devolverLibro(Prestamo prestamo, Date fechaDevolucion) {
        try {
            conectarBase();
            em.getTransaction().begin();
            prestamo.setFechaDevolucion(fechaDevolucion); // Establecer la fecha de devolución proporcionada
            // Otros pasos para actualizar el estado del préstamo, por ejemplo:
            // prestamo.setEstado("Devuelto");
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al devolver el libro: " + e.getMessage());
        } finally {
            desconectarBase();
        }
    }

}
