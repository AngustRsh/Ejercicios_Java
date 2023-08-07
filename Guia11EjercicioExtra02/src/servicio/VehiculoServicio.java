/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Vehiculo;
import enums.Color;
import enums.Tipo;
import java.util.Scanner;


public class VehiculoServicio {
    
    public Vehiculo registrarVehiculo(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese Marca del vehiculo:");
        vehiculo.setMarca(leer.next());
        System.out.println("Ingrese modelo del auto:");
        vehiculo.setModelo(leer.next());
        System.out.println("Ingrese anio del auto:");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese numero de motor:");
        vehiculo.setNumMotor(leer.nextLong());
        System.out.println("Ingrese numero de chasis:");
        vehiculo.setChasis(leer.next());
        System.out.println("Ingrese color del auto:");
        System.out.println("1- Negro");
        System.out.println("2- Blanco");
        System.out.println("3- Rojo");
        System.out.println("4- Azul");
        System.out.println("5- Gris");
        System.out.println("6- Amarillo");
        int color = leer.nextInt();
        vehiculo.setColor(Color.values()[color]);
        System.out.println("Ingrese tipo de auto");
        System.out.println("1- Sedan");
        System.out.println("2- Camioneta");
        System.out.println("3- Tres Puertas");
        System.out.println("4- Pick Up");
        int tipo = leer.nextInt();
        vehiculo.setTipo(Tipo.values()[tipo]);
        
        return vehiculo;
    }
    
    
    
    
    
}
