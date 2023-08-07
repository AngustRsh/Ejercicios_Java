/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;


public class FechaServicio {
     private Scanner leer = new Scanner(System.in);
    
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese su dÃ­a de nacimiento");
        int dia=leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes=leer.nextInt()-1;
        System.out.println("Ingrese su aÃ±o de nacimiento");
        int anio=leer.nextInt();
        Date fechaNacimiento=new Date(anio-1900,mes,dia);
        System.out.println("fecha nacimiento: "+fechaNacimiento);
        return fechaNacimiento;
    } 
    
    public Date fechaActual(){
        Date fechaActual=new Date();
        System.out.println("fecha actual: "+fechaActual);
        return fechaActual;
    }
    
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        int edad=fechaActual.getYear()-fechaNacimiento.getYear();
        
        return edad;
    }
}
