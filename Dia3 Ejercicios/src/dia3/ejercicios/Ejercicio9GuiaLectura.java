/*
    Escriba un programa que lea 20 números. Si el número leído es igual a cero 
    se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
    El programa deberá calcular y mostrar el resultado de la suma de los números
    leídos, pero si el número es negativo no debe sumarse. 
    Nota: recordar el uso de la sentencia break.
 */
package dia3.ejercicios;

import java.util.Scanner;


public class Ejercicio9GuiaLectura {

  
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        int contador=20,num,suma=0;
        
        do {
            System.out.println("Ingrese un numero, te quedan " +contador--+ " por agregar:");
            num=numeros.nextInt();
         if (num>=0){

            suma=num+suma;
            }
         
        } while ((contador>0)&&(num!=0));
 
        System.out.println("La suma de los numeros ingresados hasta haber ingresado el 0 es: " +suma);
        
    }
    
}
