/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.extras.adicionales02.original;

import entidades.Estudiante;


public class Guia7ExtrasAdicionales02Original {

   
    public static void main(String[] args) {
       
        
        Estudiante e0 = new Estudiante();
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        
       
        e1.cargarEstudiantes();
        e2.cargarEstudiantes();
        e3.cargarEstudiantes();
        
        e1.mostrar();
        e2.mostrar();
        e3.mostrar();
        
        e0.Promedio(e1.getNota_media(),e2.getNota_media(),e3.getNota_media(), e1.getNombre(), e2.getNombre(), e3.getNombre());
    }
    
}
