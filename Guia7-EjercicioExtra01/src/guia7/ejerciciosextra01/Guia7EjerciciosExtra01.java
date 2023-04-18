/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejerciciosextra01;

import entidades.Cancion;
import java.util.Scanner;


public class Guia7EjerciciosExtra01 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cancion tema1 = new Cancion();
        Cancion tema2 = new Cancion();
        
        tema1 = new Cancion("Hell Was Made in Heaven","Helloween");
        
        tema2.setTitulo(leer.nextLine());
        tema2.setAutor(leer.nextLine());

        System.out.println("El tema seleccionado es: "+tema1.getTitulo()+ " y es de: " +tema1.getAutor());
        
        
    }
    
}
