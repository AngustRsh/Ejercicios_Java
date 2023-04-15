/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Extra2bis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un largo para su vector");
        int n = leer.nextInt();

        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        System.out.println("ingrese valores para su vector1");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = leer.nextInt();
        }
        System.out.println("ingrese valores para su vector2");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = leer.nextInt();
        }
        boolean igual;

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                igual = false;
                System.out.println("los vectores son iguales : " + igual);
                break;
            } else {
                igual = true;
                if (i == vector1.length - 1) {
                    System.out.println("los vectores son iguales: " + igual);
                }

            }

        }

    }
}
