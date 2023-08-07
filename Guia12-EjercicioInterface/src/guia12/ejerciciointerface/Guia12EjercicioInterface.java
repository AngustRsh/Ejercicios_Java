/*
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
 */
package guia12.ejerciciointerface;

import entidades.Persona;
import entidades.SerVivo;


public class Guia12EjercicioInterface {
 
    public static void main(String[] args) {
        
        SerVivo personas = new Persona();   //desde la interface, se instancia la clase "Persona" para utilizar el metodo abstracto
        personas.nombrePersona();
    }
    
}
