/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_8 {

    
    public static void main(String[] args) {
        Scanner lado = new Scanner(System.in);
        
        System.out.println("Ingresar la dimension de tu cuadrado:");
        
        int resta,num = lado.nextInt();
        
        int contador = 0;
        
        do {
            resta = num--;
            
                    contador++;
                    
        } while (contador==num);
        
        System.out.println("Tu cuadrado es de dimension: " +contador);
    
    //// SIN TERMINAR NI EMPEZAR
    }
    
}
