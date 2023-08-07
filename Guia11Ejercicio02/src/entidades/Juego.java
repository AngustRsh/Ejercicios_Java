/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;



public class Juego {
    
 private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList<>();
        revolver = new Revolver();
    }

    public void llenarJuego(int cantidadJugadores) {
        for (int i = 1; i <= cantidadJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
    }

    public void ronda() {
        int ronda = 1;
        
        while (true) {
            System.out.println("Ronda " + ronda + ":");
            
            for (Jugador jugador : jugadores) {
                jugador.disparo(revolver);
                
                if (jugador.estaMojado()) {
                    System.out.println("El juego ha terminado. ¡" + jugador.getNombre() + " se mojó!");
                    return;
                }
            }
            
            ronda++;
        }
    }
    
}
