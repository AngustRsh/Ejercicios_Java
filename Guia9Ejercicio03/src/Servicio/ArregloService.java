/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

 */
package Servicio;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {
    //Metodo 1)
    public void inicializarA(double[] vectorA) {
        Random random = new Random();
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (random.nextDouble() * 10) + 1;    // genera numeros entre 1 y 10
        }
    }

    //Metodo 2)
    public void mostrarA(double[] vectorA) {
        System.out.println("Vector Original");

        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i]);
        }
        System.out.println(" ");
    }

    //Metodo 3)
    public void ordenar(double[] vectorA) {
        System.out.println("Vector Ordenado");
        Arrays.sort(vectorA);

        for (int i = vectorA.length - 1; i >= 0; i--) {
            System.out.print(vectorA[i] + " ");
        }
        System.out.println(" ");
    }

    //Metodo 4)
    public void inicializarB(double[] vectorA, double[] vectorB) {
        System.out.println("El vector B es: ");

        for (int i = 0; i < 10; i++) {
            vectorB[i] = vectorA[i];
        }
        Arrays.fill(vectorB, 10, 20, 0.5);

        for (int i = 0; i < vectorB.length; i++) {
            System.out.println(vectorB[i] + " ");
        }
        System.out.println(" ");
    }
}

