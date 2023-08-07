/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio05;

import Servicio.PersonaServicio;
import entidades.Persona;


public class Guia9Ejercicio05 {

   
    public static void main(String[] args) {
        PersonaServicio n1 = new PersonaServicio();
        Persona per = n1.crearPersona();

        
       
        
        n1.mostrarPersona(per);

    }

}
