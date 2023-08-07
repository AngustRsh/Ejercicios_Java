/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicioextra02;

import entidades.NIF;
import servicio.NIFService;


public class Guia8EjercicioExtra02 {

   
    public static void main(String[] args) {
        
        NIFService persona = new NIFService();
        NIF nif = persona.crearNif();
        
        persona.mostrar(nif);
    }
   
}
