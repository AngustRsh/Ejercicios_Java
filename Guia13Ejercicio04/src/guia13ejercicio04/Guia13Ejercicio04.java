
package guia13ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Guia13Ejercicio04 {

    public static void main(String[] args) {

        /*
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
        */
        int g;
        boolean band = true;
        Integer Num1 = 0, Num2 = 0;
        String N1 = "", N2 = "";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
            System.out.println("ingrese n1");
            N1 = leer.next();
        }catch(InputMismatchException j){
            System.out.println("ingreso mal el numero 1");
        }
        try{
            System.out.println("ingrese numero 2");
            N2 = leer.next();
        }catch(InputMismatchException t){
            System.out.println("ingreso mal el numero 2");
        }
        try{
            Num1 = Integer.parseInt(N1);
            Num2 = Integer.parseInt(N2);
        }catch(NumberFormatException r){
            System.out.println("no se pueden convertir a enteros");
            band = false;
        }
        
        if(band){
            try{
            double div = Num1/Num2;
            System.out.println(div);
            
        }catch(ArithmeticException f){
            System.out.println("dividio por cero, a primer grado");
            
        }
        }
        try{
            System.out.println("ingrese 'g'");
            g = leer.nextInt();
        }catch(InputMismatchException h){
            System.out.println("missmatcheaste we");
        }
    }
}