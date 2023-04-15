/*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
    programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
    Nota: investigar la función equals() en Java.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;

public class Ejercicio_2 {

    
    public static void main(String[] args) {
        Scanner frase=new Scanner(System.in);
        
        String fra;
        
        System.out.println("Ingrese una frase");
        fra=frase.nextLine();
        
        if (fra.equals("eureka")){
            
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
            
        }
        
        
    }
    
}
