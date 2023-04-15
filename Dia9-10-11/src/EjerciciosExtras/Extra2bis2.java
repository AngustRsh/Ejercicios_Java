/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtras;

import java.util.Scanner;


public class Extra2bis2 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int cont =0;
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Valor vec 1 nro: "+ (i+1));
            vector1[i] = leer.nextInt();
            System.out.println("Valor vec 2 nro: " + (i+1));
            vector2[i] = leer.nextInt();
        }
        
        
        
        for (int i = 0; i < n; i++) {
            if (vector1[i]==vector2[i]) {
                cont++;
            }
            
        }
        if (cont != vector1.length) {
            System.out.println("No son gemelos los vectores");
            
        }else {
            System.out.println("Son gemelos");
        }     
    }  
}