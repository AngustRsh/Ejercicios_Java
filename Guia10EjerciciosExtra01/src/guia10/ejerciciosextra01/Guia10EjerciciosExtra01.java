/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejerciciosextra01;

import java.util.ArrayList;
import servicio.NumeroServicio;


public class Guia10EjerciciosExtra01 {

   
    public static void main(String[] args) {
       
        NumeroServicio numService = new NumeroServicio();
        
        ArrayList<Integer> numeros = new ArrayList() ;
        
        numService.llenarNumero(numeros);  
    }    
}
