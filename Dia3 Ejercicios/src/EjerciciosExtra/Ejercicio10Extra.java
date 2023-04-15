/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio10Extra {

 
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 10);
       //System.out.println("" + numeroAleatorio);
        int num;
        System.out.println("Ingrese numero entero entre 1 y 10 ");
        num = input.nextInt();
        while (num !=numeroAleatorio ) {
           System.out.println("El nÃºmero ingresado no es el correcto");
           num = input.nextInt();
        }if (num == numeroAleatorio) {
            System.out.println("Acertaste, el nÃºmero era " + numeroAleatorio);
        }

    }
}
