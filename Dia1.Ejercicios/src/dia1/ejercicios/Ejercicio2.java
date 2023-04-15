/*
 * Escribir un programa que pida tu nombre, lo 
 * guarde en una variable y lo muestre por pantalla.
 */
package dia1.ejercicios;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nomb;
        
        System.out.println("Ingrese su nombre: ");
        
        // nextLine() permite escribir toda una frase o linea y lo toma igual, 
        //hasta que se haga un salto de linea.
        
        nomb = leer.nextLine();
        
        System.out.println("El nombre ingresado es " +nomb);
        System.out.println("Bienvenido " +nomb+ "!");
    
    
    
    
    
    }
    
}
