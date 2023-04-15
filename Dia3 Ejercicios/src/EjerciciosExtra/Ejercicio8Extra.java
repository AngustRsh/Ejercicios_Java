/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio8Extra {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, contador = 0, pares = 0, impares = 0;
        while (true) {
            System.out.print("Ingrese un nÃºmero entero: ");
            num = input.nextInt();
            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }
            contador++;
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de nÃºmeros leÃ­os: " + contador);
        System.out.println("Cantidad de nÃºmeros pares: " + pares);
        System.out.println("Cantidad de nÃºmeros impares: " + impares);
    }
}
