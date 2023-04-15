/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_1 {

 
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para saber su paridad");
        int num = numero.nextInt();
        
        if (num % 2 == 0){
            
            System.out.println("El numero " +num+ " es par");
            
        }else {
            System.out.println("El numero " +num+ " es impar");
        }
        
        
        
    }
    
}
