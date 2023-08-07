/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.ServicioPelicula;

/**
 *
 * @author fer_c
 */
public class PeliculaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     ServicioPelicula sp = new ServicioPelicula();
     
     sp.cargarPeliculas();
     sp.mostrarPelicula();
     sp.mayor();
     sp.mayorAmenor();
     sp.menorAmayor();
     sp.ordenNombre();
     sp.ordenDirector();
    }
    
}
