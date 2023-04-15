/*
Realizar un algoritmo que calcule la suma de todos los elementos de 
un vector de tamaño N, con los valores ingresados por el usuario.
 */
package EjerciciosExtras;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        //pide al usuario que ingrese tamano del vector
        System.out.println("Ingrese tamano del vector: ");

        int tamano = num.nextInt();

        //crea el vector con el tamano seleccionado
        int[] vector = new int[tamano];

        //rellena vector
        for (int i = 0; i < tamano; i++) {
            System.out.println("Ingrese el valor del vector para la posicion " + (i + 1));
            vector[i] = num.nextInt();

        }
        //muestra vector
        for (int i = 0; i < tamano; i++) {
            System.out.print("[ " + vector[i] + " ]");

        }
        System.out.println(" ");
        
        sumaelementos(vector, tamano);

    }

    //funcion que hace la suma de los elementos
    public static int sumaelementos(int[] vec, int tamano) {
        int suma = 0;

        for (int i = 0; i < tamano; i++) {

            suma = vec[i] + suma;

        }
        System.out.println("La suma de los elementos de los vectores es: " + suma);
        return suma;
    }
}


