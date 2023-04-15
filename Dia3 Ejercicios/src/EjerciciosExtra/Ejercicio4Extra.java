/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;


public class Ejercicio4Extra {

   
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un nÃºmero entre 1 y 10");
            num = leer.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Su equivalente en nÃºmeros romanos es: I");
                    break;
                case 2:
                    System.out.println("Su equivalente en nÃºmeros romanos es: II");
                    break;
                case 3:
                    System.out.println("Su equivalente en nÃºmeros romanos es: III");
                    break;
                case 4:
                    System.out.println("Su equivalente en nÃºmeros romanos es: IV");
                    break;
                case 5:
                    System.out.println("Su equivalente en nÃºmeros romanos es: V");
                    break;
                case 6:
                    System.out.println("Su equivalente en nÃºmeros romanos es: VI");
                    break;
                case 7:
                    System.out.println("Su equivalente en nÃºmeroa romanos es: VII");
                    break;
                case 8:
                    System.out.println("Su equivalente en nÃºmeros romanos es: VIII");
                    break;
                case 9:
                    System.out.println("Su equivalente en nÃºmeros romanos es: IX");
                    break;
                case 10:
                    System.out.println("Su equivalente en nÃºmeros romanos es: X");
                    break;

                default:
                    System.out.println("El nÃºmero no estÃ¡ dentro del rango");;
            }
        } while (num < 1 || num > 10);

    }

}
