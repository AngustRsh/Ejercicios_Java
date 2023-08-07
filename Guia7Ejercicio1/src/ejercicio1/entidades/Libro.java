/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número
de páginas.
 */
package ejercicio1.entidades;

import java.util.Scanner;


public class Libro {
    
    // Atributos
    
    public String Titulo;
    public String Autor;
    public String ISBN;
    public int numPag;
    
    
    // Constructor
    //constructor vacio
    
    public Libro() {
        
    }
    
    // parametro asginado a los atributos
    public Libro(String Titulo, String Autor, String ISBN, int numPag){ //parametros del constructor
        
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.numPag = numPag;
        
    }
    
    
    public void setTitulo(String Titulo){
        
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
        
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
   //funcion que pida rellenar los datos del usuario
    
    public void rellenar(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro:");
        this.Titulo = leer.nextLine();
        
        System.out.println("Ingrese el Autor:");
        this.Autor = leer.nextLine();
        
        System.out.println("Ingrese el ISBN:");
        this.ISBN= leer.nextLine();
        
        System.out.println("Ingrese el numero de pagina:");
        this.numPag= leer.nextInt();
        
    }
    
    // funcion que muestra los datos del libro
    
    public void mostar(){
        
        System.out.println("Titulo del libro: " +this.Titulo);
        
        System.out.println("Autor del libro: " +this.Autor);
        
        System.out.println("ISBN del libro: " +this.ISBN);
        
        System.out.println("Paginas del libro: " +this.numPag);
        
    }
    
}
