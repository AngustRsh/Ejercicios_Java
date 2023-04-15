/*
Crea una aplicación que nos pida un número por teclado y con una función 
se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
 */
package dia7.pkg8;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num=numero.nextInt();
        
        System.out.println(esprimo( num));
        
    }
 
    
    public static String esprimo(int num){
        
        String respuesta;
        int contador=0;
        respuesta = " ";
        for (int i = 1; i < num+1 ; i++) {
          
            if (num%i==0){
                contador++;
                
            }
            
            if (contador>2){
                respuesta = "El numero ingresado no es primo";
                
            }else {
                respuesta = "El numero ingresado es primo";
            }
        }
        return respuesta;
    }

}
