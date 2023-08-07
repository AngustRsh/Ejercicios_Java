/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;


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
            System.out.println(people.get(i) + " Â¿Cual de estos perros de la lista quisieras adoptar? ");
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
