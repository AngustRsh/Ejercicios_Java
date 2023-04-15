/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package entidades;

import java.util.Scanner;


public class Operacion {
    
    //Atributos
    private double numero1;
    private double numero2;

    
    //Metodo Constructor vacio
    public Operacion() {
    }

    //Metodo Constructor
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo Set
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    //Metodo Get

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    //Metodo crearOperacion
    
    public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros: ");
        this.numero1 = leer.nextDouble();
        this.numero2 = leer.nextDouble();  
    }
    
    //Metodos operacionales
    
    public void sumar(){
        
        System.out.println("La suma de " +this.numero1+ " y " +this.numero2+ " es: " +(this.numero1 + this.numero2));
        
    }
    
    public void restar(){
        
        System.out.println("La diferencia entre " +this.numero1+ " y " +this.numero2+ " es: " +(this.numero1 - this.numero2));
        
    }
    
    public void multiplicar(){
        
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Al menos uno de los numeros ingresados es 0, por lo tanto el producto es: 0 " );
            
            
        }else   {
            System.out.println("El producto entre " +this.numero1+ " y " +this.numero2+ " es: " +(this.numero1 * this.numero2) );
        }

    }
    
    public void dividir(){
        
        if (this.numero2 == 0) {
            System.out.println("El divisor no puede ser 0, por lo tanto el cociente entre los numeros no es posible de realizar.");
            
            
        }else   {
            System.out.println("El cociente entre " +this.numero1+ " y " +this.numero2+ " es: " +(this.numero1 / this.numero2) );
        }
    }
}
