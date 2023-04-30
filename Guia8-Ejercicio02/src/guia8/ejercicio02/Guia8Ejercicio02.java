/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio02;


import entidades.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;


public class Guia8Ejercicio02 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraServicio cfts = new CafeteraServicio();
        
        Cafetera cft = cfts.llenarCafetera();
        
        int opcion;
        char respuesta = 'a';

        do {
            System.out.println("Menu de Opciones");
            System.out.println("1 - Capacidad Actual.");
            System.out.println("2 - Servir Taza.");
            System.out.println("3 - Vaciar Cafetera.");
            System.out.println("4 - Agregar Cafe.");
            System.out.println("5 - Salir.");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    cfts.capaActual(cft);
                    break;
                case 2:
                    cfts.servirTaza(cft);
                    break;
                case 3:
                    cfts.vaciarCafetera(cft);
                    break;
                case 4:
                    cfts.agregarCafe(cft);
                    break;

                case 5:
                    System.out.println("Desea salir? s/n");
                    respuesta = leer.next().charAt(0);
                    break;
            }
        } while (!(respuesta == 's'));
    }
}
