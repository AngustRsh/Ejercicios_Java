/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
crea un método "retirar_dinero" que permita retirar una cantidad de dinero del
saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de 
realizar una transacción de retiro.

 */
package entidades;

import java.util.Scanner;


public class Cuenta {
    
    //Atributos
    
    private double saldo;
    private String titular;
    
    //Constructores

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //Get and Set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero() {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido " +this.titular+ " a su terminal de retiro...");
        System.out.println("Su saldo disponible es de: " +this.saldo);
        System.out.println("------------------------");
        System.out.println("Por favor, ingresa un monto para retirar: ");
        double retiro = leer.nextDouble();
        
        if (retiro > this.saldo) {
            System.out.println("Su retiro no puede ser efectuado");
            
        } else if (retiro <= this.saldo) {
            System.out.println("Procesando...");
            System.out.println("Retire su dinero de la terminal");
            System.out.println("Su saldo restante es de: " +(this.saldo-retiro));
        }
    }  
}
