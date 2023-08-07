/*
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
 * tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
 * cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
 * al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
 * persona.
 * Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
 * personas con sus respectivos perros.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josel
 */
public class adopcionServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Perro> perritos = new ArrayList();
    ArrayList<Persona> people = new ArrayList();
    ArrayList<Persona> listaAdoptados = new ArrayList();
    public ArrayList<Perro> crearListaDePerros() {
    perritos.add(new Perro("Uma", "Golden"));    
    perritos.add(new Perro("Toto", "Salchicha"));    
    perritos.add(new Perro("Tanque", "Bulldog"));    
    perritos.add(new Perro("Daysi", "Caniche"));    
    perritos.add(new Perro("Batuque", "Callejero"));    
    perritos.add(new Perro("Lancer", "Ovejero"));    
    perritos.add(new Perro("Cartucho", "Golden"));    
    
   return perritos; 
}
    
    public ArrayList<Persona> crearListaDePersonas() {
        people.add(new Persona("Jose"));
        people.add(new Persona("Pedro"));
        people.add(new Persona("Laura"));
        people.add(new Persona("Ana"));
        people.add(new Persona("Enrique"));
        people.add(new Persona("Agustina"));
        people.add(new Persona("Facundo"));
        
        return people;
    }
    
    public void adopcion() {
        int respuesta = 0;
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i) + " ¿Cual de estos perros de la lista quisieras adoptar? ");
            for (Perro perritoAux : perritos) {
                System.out.println(perritoAux);  
                
            }
            
            respuesta = leer.nextInt();
            listaAdoptados.add(new Persona(people.get(i).getNombre(), perritos.remove(respuesta - 1)));
                    
        }
        
       
        
    }
    
    public void mostrarListaAdoptados() {
        
        for (Persona adoptantes : listaAdoptados) {
            System.out.println(adoptantes);
        }
            
        } 
    
    
}
