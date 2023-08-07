/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicioextra01;

import java.util.Random;
import java.util.Scanner;

public class Guia9EjercicioExtra01 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[rand.nextInt(12)];
        //String mesSecreto = meses[5];
        String opcion;
        System.out.println("---¡Juego de adivinar el mes secreto! Ingresa tu opción:---");
        do {
            opcion = leer.next();
            if (opcion.equals(mesSecreto)) {
                System.out.println("¡Has acertado, felicidades!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (!opcion.equals(mesSecreto));
    }
}