/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio01;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class Guia8Ejercicio01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        CuentaBancaria cb1 = cbs.crearCuenta();

        int opcion;
        char respuesta = 'a';

        do {
            System.out.println("Menu de Operaciones");
            System.out.println("1 - Ingresar Dinero.");
            System.out.println("2 - Retirar Dinero.");
            System.out.println("3 - Extraccion Rapida.");
            System.out.println("4 - Consultar Saldo.");
            System.out.println("5 - Consultar Datos.");
            System.out.println("6 - Salir.");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    cbs.ingresarSaldo(cb1);
                    break;
                case 2:
                    cbs.retirarSaldo(cb1);
                    break;
                case 3:
                    cbs.extraccionRapida(cb1);
                    break;
                case 4:
                    cbs.consultarSaldo(cb1);
                    break;
                case 5:
                    cbs.consultarDatos(cb1);
                    break;
                case 6:
                    System.out.println("Desea salir? s/n");
                    respuesta = leer.next().charAt(0);
                    break;
            }
        } while (!(respuesta == 's'));
    }
}
