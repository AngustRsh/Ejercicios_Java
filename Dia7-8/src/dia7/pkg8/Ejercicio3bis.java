/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia7.pkg8;

import java.util.Scanner;


public class Ejercicio3bis {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de €");
        double euro = input.nextDouble();
        System.out.println("================================================");
        System.out.println("=          A que moneda quiere convertir:      =");
        System.out.println("=                    (1)Yenes                  =");
        System.out.println("=                    (2)Dolares                =");
        System.out.println("=                    (3)Libras                 =");
        System.out.println("================================================");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
                yenes(euro);
                break;
            case 2:
                dolares(euro);
                break;
            case 3:
                libras(euro);
                break;
        }
    }
    public static void yenes(double euro) {
        System.out.println("La convercion de " + euro + " € a  yenes es " + (129.852 * euro));
    }
    public static void dolares(double euro) {
        System.out.println("La convercion de " + euro + " € a  Dolares es " + (1.28611 * euro));
    }
    public static void libras(double euro) {
        System.out.println("La convercion de " + euro + " € a  Libras es " + (0.86 * euro));
    }
}