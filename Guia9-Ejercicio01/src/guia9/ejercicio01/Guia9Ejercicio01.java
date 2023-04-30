/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio01;

import Servicio.CadenaServicio;
import entidades.Cadena;


public class Guia9Ejercicio01 {

   
    public static void main(String[] args) {
        CadenaServicio miCadenaServicio = new CadenaServicio();
        Cadena miCadena = miCadenaServicio.crearCadena();
        
        miCadenaServicio.mostrarVocales(miCadena);
        miCadenaServicio.invertirFrase(miCadena);
    }
    
}
