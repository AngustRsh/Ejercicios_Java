/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


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
