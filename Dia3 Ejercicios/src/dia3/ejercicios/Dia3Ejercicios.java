/*
         Implementar un programa que le pida dos números enteros al 
         usuario y determine si ambos o alguno de ellos es mayor a 25.

 */
package dia3.ejercicios;

import java.util.Scanner;


public class Dia3Ejercicios {

   
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        int num1,num2;
        int constante = 25;
        System.out.println("Ingrese un número: ");
        num1 = numero.nextInt();
        
        System.out.println("Ingrese otro número: ");
        num2 = numero.nextInt();
        
        if (num1<constante){
            System.out.println("El numero " +num1+ " es mas chico que 25");
            
        }else if (num1>constante){
            System.out.println("El numero " +num1+ " es mas grande que 25");
        }
            
            
            if (num2<constante){
                    System.out.println("El numero " +num2+ " es mas chico que 25");
                    
                    }else if (num2>constante){
            System.out.println("El numero " +num2+ " es mas grande que 25");
        }
                    }
}
    
        
                    
        
        
    
   

