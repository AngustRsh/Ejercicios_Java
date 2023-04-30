    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 * @author fer_c
 */
public class CuentaBancariaServicio {
    
    CuentaBancaria cuenta01 = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria altaCuanta() {
        
        System.out.println("Ingrese su numero de DNI");
        cuenta01.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el monto con el que inicia su cuenta");
        cuenta01.setSaldoActual(leer.nextInt());
        cuenta01.setNumeroCuenta(000000);
        return cuenta01;
    }
    
    public void ingresoDinero(CuentaBancaria cuenta01) {
        System.out.println("Indique el vaor que quiere ingresar");
        double ingreso = leer.nextDouble();
        
        cuenta01.setSaldoActual(cuenta01.getSaldoActual() + ingreso);
        
    }
    
    public void retiroDinero(CuentaBancaria cuenta01) {
        System.out.println("Indique cuanti quiere retirar");
        double retiro = leer.nextDouble();
        
        if (cuenta01.getSaldoActual() >= retiro) {
            cuenta01.setSaldoActual(cuenta01.getSaldoActual() - retiro);
            
        } else {
            System.out.println("Su saldo es menor al solicitado");
            System.out.println("Se retiro" + cuenta01.getSaldoActual());
            cuenta01.setSaldoActual(0);
        }
        
    }

    public void extraccionRapida(CuentaBancaria cuenta01) {
        System.out.println("Retiro rapido del 20% " + cuenta01.getSaldoActual() * 0.2);
        
        cuenta01.setSaldoActual(cuenta01.getSaldoActual() * 0.8);
        
    }
    public void consultaSaldo(CuentaBancaria cuenta01){
        System.out.println("Su saldo actual es $" + cuenta01.getSaldoActual());
    }
    public void consultaDatos (CuentaBancaria cuenat01){
        System.out.println("Sus datos de esta cuenta son " + cuenta01.toString() );
    }
    
}
