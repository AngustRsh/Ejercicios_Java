/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Scanner;


public class NumeroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    ArrayList<Integer> numero = new ArrayList();
    
    
    public void llenarNumero(ArrayList<Integer> numero){
     
        System.out.println("Ingrese un numero a la lista: ");
        int num = leer.nextInt();
        
        while (num != -99){

        numero.add(num);
        num = leer.nextInt();
        }        
        mostrarResultados(numero);
    }
    
    public void mostrarResultados(ArrayList<Integer> numero){
        int suma = 0;
        System.out.println("La cantidad de valores agregados a la lista es de: " +numero.size());
        
        for (Integer aux: numero) {
         suma += aux; 
         }        
        System.out.println("La suma de los valores de la lista es de: " +suma);        
        System.out.println("El promedio de los valores es de: " +(suma/numero.size()));
    }
}
