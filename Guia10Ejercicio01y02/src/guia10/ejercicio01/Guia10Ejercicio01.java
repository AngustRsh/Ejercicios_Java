/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10Ejercicio01 {

    public static void main(String[] args) {

        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion = true;

        do {
            System.out.println("Ingrese la raza del perro:");
            razas.add(leer.next());
            System.out.println("Desea agregar otro perro? (S/N)");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;

            }

        } while (confirmacion);
        for (String raza : razas) {
            System.out.println(raza);
        }
        System.out.println("Ingrese la raza que desea quitar de la lista:");
        String razaEliminar = leer.next();

        Iterator it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();

            }

        }
        Collections.sort(razas);
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
}
