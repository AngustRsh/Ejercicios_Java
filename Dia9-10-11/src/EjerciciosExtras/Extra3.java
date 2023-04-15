/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o 
procedimiento que imprima el vector.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        rellenar(vec);
        mostrar(vec);

    }

    //funcion que utiliza al vector como parametro
    public static int[] rellenar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 100);
        }
        return vec;
    }

    //programa para mostrar
    public static void mostrar(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" " + vec[i]);
        }
    }
}
