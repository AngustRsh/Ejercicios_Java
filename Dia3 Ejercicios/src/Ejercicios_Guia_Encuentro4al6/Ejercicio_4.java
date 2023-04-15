/*
 Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_4 {

   
    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        
        String cadena,letra;
        System.out.println("Ingrese una frase o palabra:");
        
        cadena=palabra.nextLine();
        
        letra=cadena.substring(0,1);
        
        if (letra.equals("a")||letra.equals("A")) {
            System.out.println("CORRECTO");
            
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
