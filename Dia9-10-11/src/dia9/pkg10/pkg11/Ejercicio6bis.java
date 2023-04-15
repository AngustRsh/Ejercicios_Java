/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia9.pkg10.pkg11;


public class Ejercicio6bis {


    public static void main(String[] args) {
          // TODO code application logic here
        boolean noes = true;
        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        int comparador = 0;

        for (int i = 0; i < 3; i++) {
            comparador = comparador + matriz[0][i];
        }

        int auxiliar = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                auxiliar = auxiliar + matriz[i][j];

            }
            System.out.println("Horizontales: " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;

            } else {
                noes = false;
                break;
            }

        }
        if (noes) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    auxiliar = auxiliar + matriz[i][j];
                }
                System.out.println("Verticales: " + auxiliar);
                if (auxiliar == comparador) {
                    auxiliar = 0;

                } else {
                    noes = false;
                    break;
                }

            }
        }
        auxiliar = 0;
        if (noes) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (j == i) {
                        auxiliar = auxiliar + matriz[i][j];
                    }

                }

            }
            System.out.println("Diag : " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;

            } else {
                noes = false;
            }
        }
        auxiliar = 0;
        if (noes) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        auxiliar = auxiliar + matriz[i][j];
                    }
                }

            }
            System.out.println("Diag /: " + auxiliar);
            if (auxiliar == comparador) {
                auxiliar = 0;

            } else {
                noes = false;

            }
        }
        System.out.println("Magica es " + noes);
    }

}