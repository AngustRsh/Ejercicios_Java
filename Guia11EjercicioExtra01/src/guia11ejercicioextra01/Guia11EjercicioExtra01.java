/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejercicioextra01;

import Servicio.adopcionServicio;


public class Guia11EjercicioExtra01 {

  
    public static void main(String[] args) {
        
        adopcionServicio p1 = new adopcionServicio();
        
        p1.crearListaDePerros();
        p1.crearListaDePersonas();
        p1.adopcion();
        p1.mostrarListaAdoptados();
    } 
}
