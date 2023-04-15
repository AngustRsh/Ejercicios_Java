/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia9.pkg10.pkg11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
     Scanner leer =new Scanner(System.in); 
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        
        System.out.println("Matriz Original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(100)+1;
                
                System.out.print(" "+matriz[i][j]);    
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println(""); //Para separar visualmente en la consola
        System.out.println("");
        
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print(" "+matriz[j][i]);   //Solo se cambia i con j de lugar para hacer la transpuesta
            }
            System.out.println("");
        }
    }
    
}