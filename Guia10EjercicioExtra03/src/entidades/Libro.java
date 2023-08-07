/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
 */
package entidades;

public class Libro {

     private String titulo;
    private String autor;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void incrementarEjemplaresPrestados() {
        ejemplaresPrestados++;
        ejemplaresDisponibles--;
    }

    public void decrementarEjemplaresPrestados() {
        ejemplaresPrestados--;
        ejemplaresDisponibles++;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo +
                ", Autor: " + autor +
                ", Ejemplares disponibles: " + ejemplaresDisponibles +
                ", Ejemplares prestados: " + ejemplaresPrestados;
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + autor.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }
}

