/*
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
 * tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
 * cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
 * al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
 * persona.
 * Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
 * personas con sus respectivos perros.
 */
package Entidad;

/**
 *
 * @author josel
 */
public class Persona {
    private String nombre;
    private String apeliido;
    private int dni;
    private int edad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apeliido, int dni, int edad, Perro perro) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.dni = dni;
        this.edad = edad;
        this.perro = perro;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apeliido=" + apeliido + ", dni=" + dni + ", edad=" + edad + ", perro=" + perro + '}';
    }
    
    
    
}
