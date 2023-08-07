/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean estaMojado() {
        return mojado;
    }

    public void disparo(Revolver revolver) {
        System.out.println(nombre + " se apunta con el revolver de agua...");
        
        if (revolver.mojar()) {
            mojado = true;
            System.out.println(nombre + " se mojó!");
        } else {
            revolver.siguienteChorro();
            System.out.println(nombre + " está a salvo!");
        }
    }
}
