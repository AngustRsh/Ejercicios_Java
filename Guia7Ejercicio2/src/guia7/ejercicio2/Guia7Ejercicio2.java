/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el
radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package guia7.ejercicio2;

import entidades.Circunferencia;
import java.util.Scanner;



public class Guia7Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
      Circunferencia c1 = new Circunferencia();
      
      c1.crearCircunferencia();
      c1.setRadio(leer.nextDouble());
      
       System.out.println("el radio ingresado es: " +c1.getRadio() );
      
       
       System.out.println("El area de la circunferencia es de: " +c1.area());
       System.out.println("El perimetro de la circunferencia es de: " +c1.perimetro());

    }
    
}