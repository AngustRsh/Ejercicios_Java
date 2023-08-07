/*
LibroServicio
Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
administrar libros (consulta, creación, modificación y eliminación).
 */
package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import persistencia.LibroDAO;

public class LibroServicio {

    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;
    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }

    public void setServicios(AutorServicio autorServicio, EditorialServicio editorialServicio) {
        this.autorServicio = autorServicio;
        this.editorialServicio = editorialServicio;
    }

    // este método persiste un registro de tipo Libro en la base de datos
    // a través del método guardar() de la clase DAO.
    public Libro crearLibro(/*Integer isbn,*/String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) {
        Libro libroExiste = buscarPorTitulo(titulo);
        if (libroExiste != null) {
            return libroExiste;
        } else {
            Libro libro = new Libro();
            try {
                //libro.setIsbn(isbn);
                libro.setTitulo(titulo);
                libro.setAnio(anio);
                libro.setEjemplares(ejemplares);
                libro.setEjemplaresPrestados(ejemplaresPrestados);
                libro.setEjemplaresRestantes(ejemplaresRestantes);
                libro.setAlta(alta);
                libro.setAutor(autor);
                libro.setEditorial(editorial);

                DAO.guardar(libro);
                return libro;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

    }

    public Libro buscarPorIsbn(Integer isbn) {
        try {
            return DAO.buscarPorIsbn(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        try {
            return DAO.buscarPorTitulo(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorAutor(Autor autor) {
        try {
            return DAO.buscarPorAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarPorEditorial(Editorial editorial) {
        try {
            return DAO.buscarPorEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorIsbn(Integer isbn) {
        try {
            DAO.eliminar(isbn);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Libro> listarLibros() {
        try {
            return DAO.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
