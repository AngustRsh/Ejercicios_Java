/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Poliza;
import java.util.Scanner;


public class PolizaServicio {
    
    public Poliza contratarPoliza(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ClienteServicio cs = new ClienteServicio();
        VehiculoServicio vs = new VehiculoServicio();
        Poliza poliza = new Poliza();
        poliza.setCliente(cs.registrarCliente());
        poliza.setVehiculo(vs.registrarVehiculo());
        System.out.println("Ingrese numero de poliza:");
        poliza.setNumPoliza(leer.nextInt());
        System.out.println("Ingrese fecha de inicio de poliza:");
        
        System.out.println("Ingrese fecha de finalizacion de poliza:");
        System.out.println("Ingrese cantidad de cuotas:");
        System.out.println("Ingrese forma de pago:");
        System.out.println("Ingrese monto total asegurado:");
        System.out.println("Cubre granizo?:");
        boolean granizo = false;
        if (granizo) {
            System.out.println("Ingrese monto de cobertura por granizos:");
            
        }
        System.out.println("Seleccione tipo de cobertura:");
        
        
        return poliza;
    }

    
}
