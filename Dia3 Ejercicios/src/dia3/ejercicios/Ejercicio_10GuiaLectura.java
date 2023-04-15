/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
    el número ingresado seguido de tantos asteriscos como indique su valor. 
    Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **

 */
package dia3.ejercicios;

import java.util.Scanner;

public class Ejercicio_10GuiaLectura {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        int num,i;
        
        System.out.println("Ingresa 4 numeros");
        num = numeros.nextInt();
        
          System.out.print(num);
        
          for (i=0; i<num; i++) {
              

            System.out.print("*");
           
        }
 
    }
    
}
