/*
Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package entidades;

import java.util.Scanner;

public class Estudiantes {

    //Atributos
    private String nombre;
    private int edad;
    private double nota_media;

    //constructores
    public Estudiantes() {
    }

    public Estudiantes(String nombre, int edad, double nota_media) {
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

    //metodos
    public void calculo_notaMedia() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");     //para que no salte de linea entre un String y un int o al reves

        double contNotas = 0;
        int contEstudiantes = 0;
        String respuesta;

        do {

            System.out.println("Ingrese nombre del Estudiante:");
            this.setNombre(leer.next());
            
            System.out.println("Ingrese la edad de" +this.getNombre());
            this.setEdad(leer.nextInt());
            
            System.out.println("Ingresar la nota media de " + this.getNombre());
            this.setNota_media(leer.nextInt());
            
            contNotas = this.getNota_media()+ contNotas ;
            
            contEstudiantes++;

            System.out.println("Queres cargar otro estudiante?");
            respuesta = leer.next();
 
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("El promedio de las notas medias es: " +(contNotas)/contEstudiantes);
    }
}
    