/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cliente;
import java.util.Scanner;


public class ClienteServicio {
    
    public Cliente registrarCliente(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese nombre de la persona asegurada:");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese apellido de la persona:");
        cliente.setApellido(leer.next());
        System.out.println("Ingrese el DNI de la persona:");
        cliente.setDocumento(leer.nextInt());
        System.out.println("Ingrese mail de la persona:");
        cliente.setMail(leer.next());
        System.out.println("Ingrese domicilio de la persona:");
        cliente.setDomicilio(leer.next());
        System.out.println("Ingrese telefono de la persona:");
        cliente.setTelefono(leer.nextLong());
        
        return cliente; 
    }
    
    
    
    
    
}
