/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Editorial;
import java.util.List;

public class EditorialDAO extends DAO<Editorial> {

@Override
    public void guardar(Editorial editorial) {
        try {
            super.guardar(editorial);
        } catch (Exception e) {
            System.out.println("Error al guardar la editorial: " + e.getMessage());
        }
    }

    public void eliminar(Integer id) {
        try {
            Editorial editorial = buscarPorId(id);
            super.eliminar(editorial);
        } catch (Exception e) {
            System.out.println("Error al eliminar la editorial: " + e.getMessage());
        }
    }

    public Editorial buscarPorId(Integer id) throws Exception {
        conectarBase();
        Editorial editorial = em.find(Editorial.class, id);
        desconectarBase();
        return editorial;
    }

    public List<Editorial> listarTodos() {
        conectarBase();
        try {
            List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e", Editorial.class)
                    .getResultList();
            return editoriales;
        } catch (Exception e) {
            System.out.println("Error al listar todas las editoriales: " + e.getMessage());
            return null;
        } finally {
            desconectarBase();
        }
    }

    public Editorial buscarPorNombre(String nombre) {
        conectarBase();
        try {
            List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre", Editorial.class)
                    .setParameter("nombre", nombre).getResultList();

            // Verificamos si se encontraron resultados y devolvemos el primer elemento o null si no se encontró.
            return editoriales.isEmpty() ? null : editoriales.get(0);
        } finally {
            desconectarBase();
        }
    }

}
