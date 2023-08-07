/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio2_cafetera;

import Entedades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class POO_ejercicio2_Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cf = cs.crearCafetera();

        String opcion;

        do {
            System.out.println("1 - LLenar Cafetera");
            System.out.println("2 - Servir Taza");
            System.out.println("3 - Vaciar Cafetera");
            System.out.println("4 - Agregar Cafe");
            System.out.println("5 - Mostrar Cantidad Actual");
            System.out.println("99 - Salir");
            System.out.println("Elija una opción");
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    cs.llenarCafetera(cf);
                    break;
                case "2":
                    System.out.println("Ingrese la capacidad de la taza");
                    cs.servirTaza(cf, leer.nextInt());
                    break;
                case "3":
                    cs.vaciarCafetera(cf);
                    break;
                case "4":
                    System.out.println("Ingrese la cantidad de cafe a agregar");
                    cs.agregarCafe(cf, leer.nextInt());
                    break;
                case "5":
                    System.out.println(cs.mostrar(cf));
                    break;
                default:
                    break;

            }

        } while (!opcion.equals("99"));
    }

}
