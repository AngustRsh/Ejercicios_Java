/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:.
 */
package guia12.ejercicio01;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;


public class Guia12Ejercicio01 {

    
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich" , "Carnivoro" , 15 , "Doberman");
        perro1.mostrarAlimento();
        
        Animal perro2 = new Perro("Teddy" , "Croquetas" , 10 , "Chihuahua");
        perro2.mostrarAlimento();
        
        Animal gato = new Gato("Pelusa" , "Galletas" , 15 , "Siames");
        gato.mostrarAlimento();
        
        Animal caballo1 = new Caballo("Spark" , "Pasto" , 25 , "Fino");
        caballo1.mostrarAlimento();        
    }
}
