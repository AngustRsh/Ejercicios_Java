/*
Diseñe una función que pida el nombre y la edad de N personas e 
imprima los datos de las personas ingresadas por teclado e indique si 
son mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas y frenar cuando 
el usuario ingrese la palabra “No”.
 */
package dia7.pkg8;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        
        Scanner datos = new Scanner(System.in).useDelimiter("\n");
        String resp;
        
        do {

            System.out.println("Ingresa nombre de la persona:");
            String nombre = datos.next();

            System.out.println("Ingrese edad de la persona:");
            int edad = datos.nextInt();
             
            System.out.println(nombre + " tiene " + edad + " años");
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }
            System.out.println("Quiere seguir observando los datos?");
            resp = datos.next();

             
        } while (!resp.equalsIgnoreCase("no"));
           
       
    }

   
}
