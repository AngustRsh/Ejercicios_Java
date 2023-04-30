/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual.
Agregar constructor vacío, con parámetros, getters y setters.

 */
package Entidades;


public class CuentaBancaria {
    
    //Atributos
    
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    //Constructores
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    
    
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    //Get and Set

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
}
