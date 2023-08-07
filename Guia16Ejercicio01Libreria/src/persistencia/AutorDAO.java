/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Autor;
import java.util.List;

public class AutorDAO extends DAO<Autor> {

@Override
    public void guardar(Autor autor) {
        try {
            super.guardar(autor);
        } catch (Exception e) {
            System.out.println("Error al guardar el autor: " + e.getMessage());
        }
    }

    public void eliminar(Integer id) throws Exception {
        try {
            Autor autor = buscarPorId(id);
            super.eliminar(autor);
        } catch (Exception e) {
            System.out.println("Error al eliminar el autor: " + e.getMessage());
        }
    }

    public Autor buscarPorId(Integer id) throws Exception {
        conectarBase();
        try {
            Autor autor = em.find(Autor.class, id);
            return autor;
        } catch (Exception e) {
            System.out.println("Error al buscar autor por ID: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

    public List<Autor> listarTodos() throws Exception {
        conectarBase();
        try {
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a", Autor.class)
                    .getResultList();
            return autores;
        } catch (Exception e) {
            System.out.println("Error al listar todos los autores: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

    public Autor buscarPorNombre(String nombre) throws Exception {
        conectarBase();
        try {
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class)
                    .setParameter("nombre", nombre)
                    .getResultList();
            return autores.isEmpty() ? null : autores.get(0);
        } catch (Exception e) {
            System.out.println("Error al buscar autor por nombre: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }
}
