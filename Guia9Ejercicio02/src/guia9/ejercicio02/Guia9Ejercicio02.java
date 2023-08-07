/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio02;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosService;
import java.util.Scanner;



public class Guia9Ejercicio02 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      ParDeNumerosService miServicioParNumeros = new ParDeNumerosService();
      ParDeNumeros miParNumeros = miServicioParNumeros.crearNumeros();
      
      int opcion;
      
        do {
            System.out.println("Menu de opciones: ");
            System.out.println("1- Mostrar Valores Asignados.");
            System.out.println("2- Comprar Valores.");
            System.out.println("3- Calcular Potencia con base el mayor y exponente el menor.");
            System.out.println("4- Calcular Raiz Cuadrada del menor");
            System.out.println("5- Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    miServicioParNumeros.mostrarValores(miParNumeros);
                    break;
                case 2:
                    miServicioParNumeros.devolverMayor(miParNumeros);
                    break;
                case 3:
                    miServicioParNumeros.calcularPotencia(miParNumeros);
                    break;
                case 4:
                    miServicioParNumeros.calculaRaiz(miParNumeros);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 5);  
    }
}
