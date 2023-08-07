/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicio02;

import entidades.Juego;
import java.util.Scanner;


public class Guia11Ejercicio02 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de jugadores (entre 1 y 6):");
        int cantidadJugadores = leer.nextInt();
        leer.nextLine(); 
        
        
        // Crear el juego
        Juego juego = new Juego();
        juego.llenarJuego(cantidadJugadores);
        juego.ronda();
    }
    
}


