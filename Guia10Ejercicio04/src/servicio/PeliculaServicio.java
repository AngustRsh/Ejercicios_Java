/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import java.util.Scanner;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;

public class PeliculaServicio {

    public ArrayList<Pelicula> crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> peliculas = new ArrayList();
        boolean confirmacion = true;

        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese titulo de la pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese director de la pelicula ");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese duracion de la pelicula");
            pelicula.setDuracion(leer.nextDouble());

            peliculas.add(pelicula);

            System.out.println("Desea agregar otra pelicula?(S/N)");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;
            }
        } while (confirmacion);
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula peli : peliculas) {
            System.out.println(peli.getTitulo());
        }

    }

    public void mostrarMayorDuracion(ArrayList<Pelicula> peliculas) {
        for (Pelicula peli : peliculas) {
            if (peli.getDuracion() > 1) {
                System.out.println(peli.getTitulo());
            }
        }
    }

    public void duracionMayoraMenor(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas,Pelicula.compararDuracion);
        Collections.reverse(peliculas);
        mostrarPeliculas(peliculas);

    }
    
    public void duracionMenoraMayor(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas,Pelicula.compararDuracion);        
        mostrarPeliculas(peliculas);
    }
    
    public void ordenaTitulo(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas,Pelicula.compararTitulo);
        mostrarPeliculas(peliculas);

    }
    
    public void ordenaDirector(ArrayList<Pelicula> peliculas) {
        Collections.sort(peliculas,Pelicula.compararDirector);
        mostrarPeliculas(peliculas);

    }

}
