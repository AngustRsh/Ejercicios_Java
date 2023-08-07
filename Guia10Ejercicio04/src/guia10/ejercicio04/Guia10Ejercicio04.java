/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejercicio04;

import entidades.Pelicula;
import java.util.ArrayList;
import servicio.PeliculaServicio;




public class Guia10Ejercicio04 {

   
    public static void main(String[] args) {
       
        PeliculaServicio ps = new PeliculaServicio();
        ArrayList<Pelicula> peliculas = ps.crearPelicula();
        
        System.out.println("Las peliculas en la lista son:");
        ps.mostrarPeliculas(peliculas);
        System.out.println("----------------------");
        System.out.println("Peliculas con duracion mayor a 1 hora:");
        ps.mostrarMayorDuracion(peliculas);
        System.out.println("----------------------");
        System.out.println("Pelis ordenadas de mayor a menor duracion:");
        ps.mostrarMayorDuracion(peliculas);
        System.out.println("----------------------");
        System.out.println("Pelis ordenadas de menor a mayor duracion:");
        ps.mostrarMayorDuracion(peliculas);
        System.out.println("----------------------");
        System.out.println("Pelis ordenadas por Titulo:");
        ps.ordenaTitulo(peliculas);
        System.out.println("----------------------");
        System.out.println("Pelis ordenadas por Director:");
        ps.ordenaDirector(peliculas);
       
       
    }
    
}
