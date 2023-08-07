/*
EditorialServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar editoriales (consulta, creación, modificación y eliminación)
 */
package servicios;

import entidades.Editorial;
import java.util.List;
import persistencia.EditorialDAO;

public class EditorialServicio {

    private AutorServicio autorServicio;
    private LibroServicio libroServicio;
    private final EditorialDAO DAO;

    public EditorialServicio() {
        this.DAO = new EditorialDAO();
    }

    public void setServicios(AutorServicio autorServicio, LibroServicio libroServicio) {
        this.autorServicio = autorServicio;
        this.libroServicio = libroServicio;
    }

    // este método persiste un registro de tipo Editorial en la base de datos
    // a través del método guardar() de la clase DAO.
    public Editorial crearEditorial(/*Integer id, */String nombre, Boolean alta) {
        Editorial editorialExiste = buscarPorNombre(nombre);
        if (editorialExiste != null) {
            return editorialExiste;
        } else {
            Editorial editorial = new Editorial();
            try {
                //editorial.setId(id);
                editorial.setNombre(nombre);
                editorial.setAlta(alta);
                DAO.guardar(editorial);
                return editorial;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

    }

    public Editorial buscarPorId(Integer id) {
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public boolean eliminarPorId(Integer id) {
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Editorial> listarEditoriales() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
