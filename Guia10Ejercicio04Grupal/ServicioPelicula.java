/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
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
* 
* 
* 
 * @author fer_c
 */
public class ServicioPelicula {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> pelicula = new ArrayList();
    
    public void cargarPeliculas () {
        String aux;
        do {
            System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula");
        String director = leer.next();
        System.out.println("Ingrese la duracion, en horas");
        double horas = leer.nextDouble();
        
        Pelicula peli = new Pelicula(titulo, director, horas);
        pelicula.add(peli);
        
            System.out.println("Desea cargar otra pelicula? : S/N");
            aux = leer.next();
            while (!aux.equalsIgnoreCase("S") && !aux.equalsIgnoreCase("N")) {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Desea cargar otra pelicula? : S/N");
                aux = leer.next();
            }
        } while (aux.equalsIgnoreCase("S"));
        
    } 
    //Mostrar en pantalla todas las películas.
public void mostrarPelicula() {
       System.out.println("Las peliculas son: ");
       for (Pelicula var: pelicula){
           System.out.println(var);
       }
   }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

public void mayor() {
    Iterator<Pelicula> it = pelicula.iterator();
    while (it.hasNext()) {
        Pelicula aux = it.next();
        if (aux.getDuracion()> 1) {
            System.out.println("Las peliculas con mas de una hora de duracion son : " + aux.getNombre());
        }
    }
}




public void mayorAmenor() {
    
    Collections.sort(pelicula,Comparadores.ordenarDuracion);
    Collections.reverse(pelicula);
    for (Pelicula aux : pelicula) {
        System.out.println(aux.getDuracion());
    }
} 
public void menorAmayor() {
    
    Collections.sort(pelicula,Comparadores.ordenarDuracion );
    for (Pelicula aux : pelicula) {
        System.out.println(aux.getDuracion());
    }
}
public void ordenNombre() {
    
    Collections.sort(pelicula,Comparadores.ordenarNombre );
    for (Pelicula aux : pelicula) {
        System.out.println(aux.getNombre());
    }
}
public void ordenDirector() {
    
    Collections.sort(pelicula,Comparadores.ordenarDirector );
    for (Pelicula aux : pelicula) {
        System.out.println(aux.getDirector());
    }
}
}
    

