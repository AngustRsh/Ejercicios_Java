/*
AutorServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar autores (consulta, creación, modificación y eliminación).
 */
package servicios;

import entidades.Autor;
import java.util.List;
import persistencia.AutorDAO;

public class AutorServicio {

    private EditorialServicio editorialServicio;
    private LibroServicio libroServicio;
    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

    public void setServicios(EditorialServicio editorialServicio, LibroServicio libroServicio) {
        this.editorialServicio = editorialServicio;
        this.libroServicio = libroServicio;
    }

    // este método persiste un registro de tipo Editorial en la base de datos
    // a través del método guardar() de la clase DAO.
    public Autor crearAutor(/*Integer id, */String nombre, Boolean alta) {
        Autor autorExiste = buscarPorNombre(nombre);

        if (autorExiste != null) {
            return autorExiste;
        } else {
            Autor autor = new Autor();
            try {
                //autor.setId(id);
                autor.setNombre(nombre);
                autor.setAlta(alta);
                DAO.guardar(autor);
                return autor;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

    }

    public Autor buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorId(Integer id){
        try {
            return DAO.buscarPorId(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public boolean eliminarPorId(Integer id){
        try {
            DAO.eliminar(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public List<Autor> listarAutores() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
