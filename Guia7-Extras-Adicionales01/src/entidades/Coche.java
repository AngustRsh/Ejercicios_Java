/*
Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
package entidades;

import java.util.Scanner;

public class Coche {

    //Atributos
    private String marca;
    private String modelo;
    private double precio;

    //Constructores
    public Coche() {
    }

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Get and Set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Mostrar
    public void mostrar_Datos() {

    System.out.println("La marca del coche es " + this.getMarca() + ". "
                + "El modelo es " + this.getModelo() + " y su precio es de: $" + this.getPrecio());
    }

}
