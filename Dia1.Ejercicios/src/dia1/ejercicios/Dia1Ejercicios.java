/*
 *Escribir un programa que pida dos números enteros por teclado y calcule 
 *la suma de los dos. El programa deberá después mostrar el 
 *resultado de la suma
 */
package dia1.ejercicios;

import java.util.Scanner;


public class Dia1Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // clase Scanner para que pueda leer lo que se ingresa por teclado
        Scanner leer = new Scanner(System.in);
        int num1,num2 ;
       
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();
        
        
        System.out.println("La suma de " +num1+ " y " +num2+ " es: " +(num1+num2));
        
    }
    
}
