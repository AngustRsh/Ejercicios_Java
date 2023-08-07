/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio04;

import Service.FechaServicio;


public class Guia9Ejercicio04 {

   
    public static void main(String[] args) {
        FechaServicio fechaMain=new FechaServicio();
        
        
        System.out.println("Su edad es:"+fechaMain.diferencia(fechaMain.fechaNacimiento(), fechaMain.fechaActual()));
        
    }
            
}