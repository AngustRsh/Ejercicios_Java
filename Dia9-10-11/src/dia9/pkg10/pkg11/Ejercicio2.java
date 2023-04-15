/*
Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package dia9.pkg10.pkg11;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
            System.out.println(vector[i]);
        }

        System.out.println("ingrese el numero a buscar");
        
        int recorrido = leer.nextInt();
        int cont = 0;
       
        for (int i = 0; i < n; i++) {
            if (vector[i] == recorrido) {
                cont++;
                System.out.println("se encontro el numero en el lugar " + (i + 1));

            }
        }
        System.out.println("se encontro las siguientes veces " + cont);
    }
}
