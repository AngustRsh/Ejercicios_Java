/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.extras.adicionales01;

import entidades.Coche;
import java.util.Scanner;


public class Guia7ExtrasAdicionales01 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       Coche c1 = new Coche();
       
       System.out.println("Ingrese la marca del Coche: ");
       c1.setMarca(leer.nextLine());
       
       System.out.println("Ingrese el modelo del Coche: ");
       c1.setModelo(leer.nextLine());
       
       System.out.println("Ingrese el precio del Coche: ");
       c1.setPrecio(leer.nextDouble());
       
       c1.mostrar_Datos();
       
    }
}
