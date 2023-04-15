/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter
‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;


public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese dos enteros positivos:");
        int num1 = numero.nextInt(), num2 = numero.nextInt();

        do {
        System.out.println("MENU:");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("Elija opcion:");

        int opc = numero.nextInt();   //opc = opcion
        char confirmacion;

        switch (opc) {
            case 1:
                System.out.println("La suma de " + num1 + " y " + num2 + " es:" + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de " + num1 + " y " + num2 + " es:" + (num1 - num2));
                break;
            case 3:
                System.out.println("El producto de " + num1 + " y " + num2 + " es:" + (num1 * num2));
                break;
            case 4:
                double div = (double) num1 / num2;
                System.out.println("El cociente de " + num1 + " y " + num2 + " es:" + div);
                break;
            case 5:
                System.out.println("Esta seguro que quiere salir del programa (S/N)?");

                confirmacion = numero.next().charAt(0);

                if ((confirmacion == 's') || (confirmacion == 'S')) {
                    System.out.println("Finalizando programa");
                    System.exit(0);
                }
                break;

            default:
                System.out.println("Ingrese una opcion valida");
        }
        
        } while (true);
    
    }

}

            
            




