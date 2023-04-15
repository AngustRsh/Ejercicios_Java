/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio5Extra {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String letra;
        Double costo, costosocio;

        do {
            System.out.println("ingrese que tipo de socio es");
            letra = leer.next();
            //letra = leer.nextLine().substring(0, 1);
            letra = letra.toUpperCase();
            if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C")) {
                System.out.println("No existe la categoria de socio, por favor ingrese una correcta");                
            }
        } while (!letra.equalsIgnoreCase("A") && !letra.equals("B") && !letra.equals("C"));

        System.out.println("ingrese el costo del tratamiento");
        costo = leer.nextDouble();

        switch (letra) {
            case "A":
                costosocio = costo * 0.5;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "B":
                costosocio = costo * 0.65;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
            case "C":
                costosocio = costo;
                System.out.println("El costo que debera abonar el socio es: $" + costosocio);
                break;
        }
    }
    
}