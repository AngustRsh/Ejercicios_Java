/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package guia13ejercicio02;

import java.util.Scanner;


public class Guia13Ejercicio02 {


    public static void main(String[] args) {
        
        int aux;
        aux =0;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leerN.nextInt();
        int[] vec1 = new int[n];
        
        for (int i = 0; i < vec1.length; i++)
        {
            System.out.print("Ingrese elementos al vector: " +"["+ i + "]");
            vec1[i]= leerN.nextInt();
        }
        for (int i = 0; i < vec1.length; i++)
        {
            aux +=vec1[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + aux);
    }
}
    
    

