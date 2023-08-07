/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui8.ejercicioextraextra01;

import Servicios.FraccionServicio;
import entidades.Fraccion;
import java.util.Scanner;


public class Gui8EjercicioExtraExtra01 {

 
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");

        FraccionServicio miFraccionServicio = new FraccionServicio();
        Fraccion miFraccion = miFraccionServicio.crearObjeto();

        int opcion;
        do {
            System.out.println("Ingrese la operación a realizar");
            System.out.println("");
            System.out.println("1- Suma.");
            System.out.println("2- Resta.");
            System.out.println("3- Multiplicación.");
            System.out.println("4- División.");
            System.out.println("5-Salir");
            System.out.println("");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    miFraccionServicio.sumarFraccion(miFraccion);
                    break;

                case 2:
                    miFraccionServicio.restarFraccion(miFraccion);
                    break;
                case 3:
                    miFraccionServicio.multiplicarFraccion(miFraccion);
                    break;

                case 4:
                    miFraccionServicio.dividirFraccion(miFraccion);
                    break;
                case 5:
                    System.out.println("bye bye");
                    break;

            }

        } while (opcion != 5);

    }

}