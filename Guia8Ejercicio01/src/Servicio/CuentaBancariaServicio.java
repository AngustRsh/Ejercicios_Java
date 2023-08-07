/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo a)
    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingrese numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese numero de DNI : ");
        cuenta.setDniCliente(leer.nextLong());

        System.out.println("Ingrese saldo actual : ");
        cuenta.setSaldoActual(leer.nextDouble());

        return cuenta;
    }

    // Metodo b)
    public void ingresarSaldo(CuentaBancaria cuenta) {

        System.out.println("Ingrese el saldo que quiere depositar: ");
        cuenta.setSaldoActual(leer.nextDouble() + cuenta.getSaldoActual());

    }

    // Metodo c)
    public void retirarSaldo(CuentaBancaria cuenta) {

        System.out.println("Ingre el monto a retirar: ");
        double retiro = leer.nextDouble();

        if (retiro > cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cuenta.getSaldoActual());
            System.out.println("Se retiro el maximo posible, su cuenta tiene: " + cuenta.getSaldoActual());

        } else {
            System.out.println("Se retiro: " + retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }

    }

    // Metodo d)
    public void extraccionRapida(CuentaBancaria cuenta) {

        if (cuenta.getSaldoActual() < 1) {
            System.out.println("Saldo insuficiente");
            cuenta.setSaldoActual(0);

        } else {
            System.out.println("Se extrajo: " + cuenta.getSaldoActual() * 0.2);
            cuenta.setSaldoActual(cuenta.getSaldoActual() * 0.8);
        }
    }

    // Metodo e)
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo disponible es de: " + cuenta.getSaldoActual());

    }

    // Metodo f)
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Los datos de su cuenta:");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo Restante: " + cuenta.getSaldoActual());
    }
}
