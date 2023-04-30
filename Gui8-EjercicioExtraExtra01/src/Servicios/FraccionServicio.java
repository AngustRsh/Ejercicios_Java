/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Fraccion;
import java.util.Scanner;


public class FraccionServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Fraccion crearObjeto() {
        Fraccion objetoFraccion = new Fraccion();
        System.out.println("ingrese numerador1");
        objetoFraccion.setNumerador1(leer.nextInt());
        System.out.println("ingrese numerador2");
        objetoFraccion.setNumerador2(leer.nextInt());
        System.out.println("ingrese denominador1");
        objetoFraccion.setDenominador1(leer.nextInt());
        System.out.println("ingrese denominador2");
        objetoFraccion.setDenominador2(leer.nextInt());

        return objetoFraccion;
    }
    
     public void sumarFraccion(Fraccion objetoFraccion) {
        int totDenominador;
        int totNumerador;
        int mcd = calcularMCD(objetoFraccion.getDenominador1(), objetoFraccion.getDenominador2()); // Calcular el máximo común divisor
        int mcm = (objetoFraccion.getDenominador1() * objetoFraccion.getDenominador2()) / mcd; // Calcular el mínimo común múltiplo
       
       int a= mcm / objetoFraccion.getDenominador1() * objetoFraccion.getNumerador1();
       int b= mcm / objetoFraccion.getDenominador2() * objetoFraccion.getNumerador2();
       totDenominador = mcm;
       totNumerador = a+b;
       System.out.println("el resultado de la suma de la fraccion es igual " + 
       totNumerador+"/"+totDenominador);
             
    }

    private int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }
    }
    
     public void restarFraccion(Fraccion objetoFraccion) {
        int totDenominador;
        int totNumerador;
        int mcd = calcularMCD(objetoFraccion.getDenominador1(), objetoFraccion.getDenominador2()); // Calcular el máximo común divisor
        int mcm = (objetoFraccion.getDenominador1() * objetoFraccion.getDenominador2()) / mcd; // Calcular el mínimo común múltiplo
       
       int a= mcm / objetoFraccion.getDenominador1() * objetoFraccion.getNumerador1();
       int b= mcm / objetoFraccion.getDenominador2() * objetoFraccion.getNumerador2();
       totDenominador = mcm;
       totNumerador = a-b;
       System.out.println("el resultado de la resta de la fraccion es igual " + 
       totNumerador+"/"+totDenominador);
             
    }

   public void multiplicarFraccion(Fraccion objetoFraccion){
      int totNumerador= objetoFraccion.getNumerador1()*objetoFraccion.getNumerador2();
      int totDenominador= objetoFraccion.getDenominador1()*objetoFraccion.getDenominador2();
       System.out.println("el resultado de la multiplicacion es " + totNumerador+"/" +totDenominador );
       
   }
    
   public void dividirFraccion(Fraccion objetoFraccion){
      int totNumerador= objetoFraccion.getNumerador1()*objetoFraccion.getDenominador2();
      int totDenominador= objetoFraccion.getDenominador1()*objetoFraccion.getNumerador2();
       System.out.println("el resultado de la division es " + totNumerador+"/" +totDenominador );
       
   } 

   
    
}