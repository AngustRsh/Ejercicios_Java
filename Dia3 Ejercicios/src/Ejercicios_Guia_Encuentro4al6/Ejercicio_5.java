/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_5 {

    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int limite = numero.nextInt();
        
        int num,suma=0;
        
        do {
            System.out.println("Ingresa un numero:");
            num=numero.nextInt();
            suma= num + suma;
        
        } while (suma<limite);
        
        //System.out.println("La suma de los numeros ingresados es: " +suma;
    }
    
}
