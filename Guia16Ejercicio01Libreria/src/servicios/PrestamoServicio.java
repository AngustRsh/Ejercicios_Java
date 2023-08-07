/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import entidades.Libro;
import entidades.Prestamo;
import java.util.Date;
import java.util.List;
import persistencia.PrestamoDAO;

public class PrestamoServicio {

    private LibroServicio libroServicio;
    private ClienteServicio clienteServicio;
    private final PrestamoDAO DAO;

    public PrestamoServicio() {
        this.DAO = new PrestamoDAO();
    }

    public void setServicio(LibroServicio libroServicio, ClienteServicio clienteServicio) {
        this.libroServicio = libroServicio;
        this.clienteServicio = clienteServicio;
    }

    // este método persiste un registro de tipo Prestamo en la base de datos
    // a través del método guardar() de la clase DAO.
    public Prestamo crearPrestamo(Date fechaPrestamo, Date fechaDevolucion, Cliente cliente, Libro libro) {
        List<Prestamo> prestamosDelCliente = obtenerPrestamosPorCliente(cliente);

        if (!prestamosDelCliente.isEmpty()) {
            return null;
        }

        Prestamo prestamo = new Prestamo();
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setFechaDevolucion(fechaDevolucion);
        prestamo.setCliente(cliente);
        prestamo.setLibro(libro);

        try {
            DAO.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println("Error al guardar el préstamo: " + e.getMessage());
            return null;
        }
    }

    public List<Prestamo> buscarPorCliente(Cliente cliente) {
        try {
            return DAO.buscarPorCliente(cliente);
        } catch (Exception e) {
            System.out.println("Error al buscar préstamo por cliente: " + e.getMessage());
            return null;
        }
    }

    public List<Prestamo> obtenerPrestamosPorCliente(Cliente cliente) {
        List<Prestamo> prestamosDelCliente = buscarPorCliente(cliente);
        return prestamosDelCliente;
    }

    public List<Prestamo> buscarPrestamosActivosPorLibro(Libro libro) {
        try {
            return DAO.buscarPrestamosActivosPorLibro(libro);
        } catch (Exception e) {
            System.out.println("Error al buscar prestamos activos por libro" + e.getMessage());
            return null;
        }

    }

    public Prestamo buscarPorId(int prestamoId) {
        try {
            return DAO.buscarPorId(prestamoId);
        } catch (Exception e) {
            System.out.println("Error al buscar el prestamo por ID" + e.getMessage());
            return null;
        }
    }

    public void devolverLibro(Prestamo prestamoSeleccionado, Date fechaDevolucion) {
        try {
            DAO.devolverLibro(prestamoSeleccionado, fechaDevolucion);
            System.out.println("Libro devuelto exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al devolver libro: " + e.getMessage());
        }
    }

}
