/*
    Escribir un programa que lea un número entero por teclado y 
    muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
 */
package dia1.ejercicios;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args) {
        Scanner numero=new Scanner(System.in);
        
        long num1,raiz;
        
        System.out.println("Ingresar un número entero: ");
        num1=numero.nextLong();
        
        
        System.out.println("El doble del número es: " +num1*2);
        System.out.println("El triple del número es: " +num1*3);
        System.out.println("La raíz cuadrada del número es: " +Math.sqrt(num1));
        
        
        
        
        
        
    }
    
}
