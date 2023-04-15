/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia7.pkg8;

import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de Euros: ");
    System.out.println("Euros: ");
        double euros = leer.nextDouble();

    System.out.println (

    "");
    System.out.println (

    "A qué divisa desea convertir"
                + "\nLibra"
                + "\nDolar"
                + "\nYen");
    leer.nextLine ();
    String divisa = leer.nextLine();

    conversionDivisas(euros, divisa);
}

public static int conversionDivisas(double euros, String divisa) {
        double valorConvertido = 0;
        String valor = "h";

        if (divisa.equalsIgnoreCase("Libra")) {
            valorConvertido = euros * 0.86;
            valor = "Libras";
        } else if (divisa.equalsIgnoreCase("Dolar")) {
            valorConvertido = euros * 1.28611;
            valor = "Dólares";
        } else if (divisa.equalsIgnoreCase("Yen")) {
            valorConvertido = euros * 129.852;
            valor = "Yenes";
        }

        System.out.println(euros + " euros son igual a: " + valorConvertido
                + " " + valor);
        return 0;
    }
}
