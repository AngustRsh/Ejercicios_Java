/*
Crea una aplicación que le pida dos números al usuario y este pueda 
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe 
tener una función para cada operación matemática y deben devolver sus 
resultados para imprimirlos en el main.
 */
package dia7.pkg8;

import java.util.Scanner;


public class Ejercicio1_Guia {

 
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Ingre 2 numeros: ");

        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int opc;

        do {
 
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Salir");

            opc = num.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma de los numeros es: " +suma(num1,num2));
                    
                    break;
                    
                case 2:
                    System.out.println("La resta de los numeros es: " +resta(num1,num2));
                    
                    break;
                    
                case 3:
                    System.out.println("El producto de los numeros es: " +producto(num1,num2));
                    
                    break;
                    
                case 4:
                    System.out.println("El cociente de los numeros es: " +div(num1,num2));
                    
                    break;
                    
                case 5:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
            
        } while (opc != 5 );
    }

    public static int suma(int a,int b) {
        
      
        return a+b;
    }
    
        public static int resta(int a,int b) {
        
      
        return a-b;
    }
        public static int producto(int a,int b) {
        
      
        return a*b;
    }

         public static double div(double a,double b) {
        
      
        return a/b;
    }
}
