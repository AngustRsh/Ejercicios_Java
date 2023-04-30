/*
Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package entidades;

import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota_media;
   

    //constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota_media) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota_media = nota_media;
      
    }

    //Get and Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }


    public void mostrar() {
 
        System.out.println("El nombre es: " +nombre);
        System.out.println("Nota Media: " +nota_media);

    }
        
    public void cargarEstudiantes() {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nombre del estudiante: ");
        nombre = leer.next();
        
        System.out.println("Ingrese nota media: ");
        nota_media = leer.nextDouble();
        
    }

    public void Promedio(double e1,double e2, double e3, String n1, String n2, String n3) {
        
        double Promedio = (e1+e2+e3)/3 ;
        
        System.out.println("el promedio es:" +Promedio);
        
        if (e1 >= Promedio) {
            System.out.println("El estudiante " +n1+ " tiene una nota superior al promedio");
            
        }
        if (e2 >= Promedio) {
            System.out.println("El estudiante " +n2+ " tiene una nota superior al promedio");
            
        }
        if (e3 >= Promedio) {
            System.out.println("El estudiante " +n3+ " tiene una nota superior al promedio");
            
        }
    }
}

