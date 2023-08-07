/*
Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package guia12.ejercicioanimal;

import entidades.Animal;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

public class Guia12EjercicioAnimal {


    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animalAux : animales) {
            System.out.println(animalAux.hacerRuido());
        }   
    }    
}
