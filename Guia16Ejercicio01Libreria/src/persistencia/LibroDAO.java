/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.List;
import java.util.Scanner;

public class LibroDAO extends DAO<Libro> {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Integer isbn) throws Exception {
        Libro libro = buscarPorIsbn(isbn);
        super.eliminar(libro);
    }
    
        public Libro editarAutorNombre(String titulo) throws Exception  {
        Libro libro1 = buscarPorTitulo(titulo);
        System.out.println("Ingrese titulo nuevo,");        
        libro1.setTitulo(leer.next());
        super.editar(libro1);
        return libro1;        
    }
    

    public Libro buscarPorIsbn(Integer isbn) throws Exception {
        conectarBase();
        Libro libro = em.find(Libro.class, isbn);
        desconectarBase();
        return libro;
    }

    public Libro buscarPorTitulo(String titulo) throws Exception {
        try {
            conectarBase();
            List<Libro> libros = em.createQuery("SELECT m FROM Libro m WHERE m.titulo = :titulo", Libro.class)
                    .setParameter("titulo", titulo)
                    .getResultList();
            desconectarBase();
            return libros.isEmpty() ? null : libros.get(0);
        } finally {
            desconectarBase();
        }

    }

    public List<Libro> listarTodos() throws Exception {
        conectarBase();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m")
                .getResultList();
        desconectarBase();
        return libros;
    }

//    public Libro buscarPorEditorial(Editorial editorial) throws Exception {
//        conectarBase();
//        Libro libro = em.find(Libro.class, editorial);
//        desconectarBase();
//        return libro;
//    }
    public List<Libro> buscarPorAutor(Autor autor) throws Exception {
        conectarBase();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m WHERE m.autor = :ParametroAutor", Libro.class) //se utiliza para proporcionar información sobre el tipo de resultado esperado de la consulta y facilitar el mapeo de los resultados a objetos de la clase Libro.
                .setParameter("ParametroAutor", autor).getResultList();

        desconectarBase();
        return libros;
    }

    public List<Libro> buscarPorEditorial(Editorial editorial) throws Exception {
        conectarBase();
        List<Libro> libros = em.createQuery("SELECT m FROM Libro m WHERE m.editorial = :ParametroEditorial", Libro.class) //se utiliza para proporcionar información sobre el tipo de resultado esperado de la consulta y facilitar el mapeo de los resultados a objetos de la clase Libro.
                .setParameter("ParametroEditorial", editorial).getResultList();

        desconectarBase();
        return libros;
    }

}
