/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia11ejercicio01;

import entidades.Perro;
import entidades.Persona;


public class Guia11Ejercicio01 {

   
    public static void main(String[] args) {
        
        Perro pet1 = new Perro("Chichito","Callejero",4,"mediano");
        Perro pet2 = new Perro("Mora","Pastor Australiano",2,"chico");
        Persona perso1 = new Persona("Nahuel","Moyano",31,36577419,pet1);
        Persona perso2 = new Persona("Adriel","Sanchez",41,33654872,pet2);
        
        System.out.println(perso1);
        System.out.println(perso2);
        
    }
    
}
