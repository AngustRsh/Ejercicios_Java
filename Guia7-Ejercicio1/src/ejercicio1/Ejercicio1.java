/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método para
cargar un libro pidiendo los datos al usuario y luego informar mediante otro 
método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejercicio1;

import ejercicio1.entidades.Libro;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        Libro l1 = new Libro();
        
        l1.rellenar();
        l1.mostar();

    }

}
