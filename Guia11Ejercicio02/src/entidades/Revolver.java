/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;


public class Revolver {
    
   private int posicionActual;
    private int posicionAgua;
    private Random random;

    public Revolver() {
        random = new Random();
        llenarRevolver();
    }

    public void llenarRevolver() {
        posicionActual = random.nextInt(6); // Posición aleatoria entre 0 y 5
        posicionAgua = random.nextInt(6); // Posición aleatoria entre 0 y 5
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición agua: " + posicionAgua;
    }
    
}
