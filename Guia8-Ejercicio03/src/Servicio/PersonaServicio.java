/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su 
peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de 
la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo b)
    public Persona crearPersona() {

        Persona pers = new Persona();

        System.out.println("Ingrese el nombre: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese edad: ");
        pers.setEdad(leer.nextInt());
        char sexo;
        do {
            System.out.println("Ingrese sexo ('H', 'M' , 'O'): ");
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        pers.setSexo(sexo);
        System.out.println("Ingrese peso:");
        pers.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura: ");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    //Metodo a)
    public boolean esMayorDeEdad(Persona pers) {
        
        return pers.getEdad() >= 18;
    }

    //Metodo c)
    public int calcularIMC(Persona pers) {
        double pesoIdeal = pers.getPeso() / (Math.pow(pers.getAltura(), 2));
        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal <= 25) {
            return 0;
        }
        return 1;
    }
    
    
    
}


