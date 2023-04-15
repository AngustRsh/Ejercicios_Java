/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio9Extra {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int dividendo,divisor,contadorRestas = 0;
        System.out.println("Ingrese un nÃºmero mayor a uno como dividendo");
        dividendo= input.nextInt();
        System.out.println("Ingrese un nÃºmero mayor a uno como divisor");
        divisor= input.nextInt();
        
        while (dividendo >= divisor) {
            System.out.println(dividendo + " - " + divisor + " = " + (dividendo - divisor) + "    " + (contadorRestas + 1) + " restas realizadas");
            dividendo = dividendo - divisor;
            contadorRestas++;
        }

        System.out.println("El cociente es: " + (contadorRestas));
        System.out.println("El residuo es: " + dividendo);
    }
}

