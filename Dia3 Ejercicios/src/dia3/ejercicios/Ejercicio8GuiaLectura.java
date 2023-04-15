/*
    Escriba un programa que valide si una nota está entre 0 y 10, sino 
    está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package dia3.ejercicios;

import java.util.Scanner;


public class Ejercicio8GuiaLectura {

   
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese una nota:");
        
        int nota= numero.nextInt();
        
        while ((nota<0)||(nota>10)){
  
            System.out.println("La nota ingresada es incorrecta. Por favor ingrese otra:");
               nota= numero.nextInt();
               
        }
    
        System.out.println("La nota ingresada es: " +nota);
       
    }
     
}
