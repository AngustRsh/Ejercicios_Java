/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio01;

import Servicio.CadenaServicio;
import entidades.Cadena;
import java.util.Scanner;


public class Guia9Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio miCadenaServicio = new CadenaServicio();
        Cadena miCadena = miCadenaServicio.crearCadena();

        int opcion;
        char respuesta = 'a';

        do {
            System.out.println("Menu de Opciones");
            System.out.println("1 - Contar la cantidad de vocales que contiene la frase.");
            System.out.println("2 - Invertir frase.");
            System.out.println("3 - Cuantas veces se repite un caracter.");
            System.out.println("4 - Comparacion de longitud de frases.");
            System.out.println("5 - Concatenar frase.");
            System.out.println("6 - Reemplazar las 'a' de la frase original.");
            System.out.println("7 - Comprueba la existencia de un caracter en la frase original.");
            System.out.println("8 - Salir.");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    miCadenaServicio.mostrarVocales(miCadena);
                    break;
                case 2:
                    miCadenaServicio.invertirFrase(miCadena);
                    break;
                case 3:
                    miCadenaServicio.vecesRepetido(miCadena);
                    break;
                case 4:
                    miCadenaServicio.comprarLongitud(miCadena);
                    break;
                case 5:
                    miCadenaServicio.unirFrase(miCadena);
                    break;
                case 6:
                    miCadenaServicio.reemplazar(miCadena);
                    break;
                case 7:
                    miCadenaServicio.contiene(miCadena);
                    break;

                case 8:
                    System.out.println("Desea salir? s/n");
                    respuesta = leer.next().charAt(0);
                    break;
            }
        } while (!(respuesta == 's'));
    }
}
