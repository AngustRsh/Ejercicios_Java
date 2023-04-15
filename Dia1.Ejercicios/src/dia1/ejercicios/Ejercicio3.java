/*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
        después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package dia1.ejercicios;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
        Scanner letras = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingresar una frase: ");
        frase= letras.nextLine();
        
        
        
        System.out.println("La frase ingresada en mayuscula es :");
        System.out.println(frase.toUpperCase());
        
        System.out.println("La frase ingresada en minuscula es :");
        System.out.println(frase.toLowerCase());

    }
    
}
