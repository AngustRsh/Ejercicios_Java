/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Lenght() en Java.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_3 {

    
    public static void main(String[] args) {
        
        Scanner palabra = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase:");
        
        String cadena =palabra.nextLine();
        
        if (cadena.length()==8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
