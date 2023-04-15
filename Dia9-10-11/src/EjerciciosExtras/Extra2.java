/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia 
entre los elementos).
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Extra2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Ingrese tamano para los 2 vectores");
        int n = imput.nextInt();
        int[] vec1 = new int[n];
        int[] vec2 = new int[n];
        int contador = 0;
        boolean bandera;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " del vector 1");
            vec1[i] = imput.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " del vector 2");
            vec2[i] = imput.nextInt();
        }
        //muestra vectores
        System.out.println("Vector 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vec1[i] + " ]");
        }

        System.out.println(" ");

        System.out.println("Vector 2: ");

        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vec2[i] + " ]");
        }
        System.out.println(" ");

        for (int i = 0; i < n; i++) {

            if (vec1[i] == vec2[i]) {
                contador++;
            }
        }
        if (contador == n) {
            System.out.println("Los vectores son iguales");
        }
        if (contador < n) {
            System.out.println(" Los vectores tienen distintos elementos");

        }

    }
}
