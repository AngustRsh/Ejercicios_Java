/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia9.pkg10.pkg11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[3][3];

        // valores ingresados para revisar funcionalidad
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 5;
        matriz[1][0] = -2;
        matriz[1][1] = 8;
        matriz[1][2] = -9;
        matriz[2][0] = -5;
        matriz[2][1] = 9;
        matriz[2][2] = 4;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("   " + matriz[i][j]);
            }
            System.out.println("");

            /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] =aleatorio.nextInt(10) + 1;

                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
             */
            
        }
        if ((matriz[0][1] == -matriz[1][0]) && (matriz[1][2] == -matriz[2][1]) && (matriz[0][2] == -matriz[2][0])) {
                System.out.println("La matriz ingresada es Antisimetrica");

            } else {
                System.out.println("La matriz ingresada es NO ES Antisimetrica");
            }
    }
}
