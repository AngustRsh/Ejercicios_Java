/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
 * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:


 * @author fer_c
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    
//////////////////////////////////////////////////////////////////////////
    
    
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    
/////////////////////////////////////////////////////////////////////////
    
    
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

    
//////////////////////////////////////////////////////////////////////////////
    
    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
    
    
}
