/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entedades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){
        
        System.out.println("Ingrese la capacidad máxima");
        Cafetera cf = new Cafetera(leer.nextDouble(),0);
        return cf;
    }
    
    
    public void llenarCafetera(Cafetera cf){
        cf.setCantidadActual(cf.getCapacidadMaxima());
    }
    
    public void servirTaza (Cafetera cf, int capacidadTaza){
        if (cf.getCantidadActual()>= capacidadTaza) {
            cf.setCantidadActual(cf.getCantidadActual()-capacidadTaza);
            System.out.println("Taza llena");
        }else{
            System.out.println("La cantidad de café no alcanza. Se sirve solo "+cf.getCantidadActual());
            cf.setCantidadActual(0);
            
        }
    }
    
    public void vaciarCafetera (Cafetera cf){
        cf.setCantidadActual(0);
        
    }
    
    public void agregarCafe (Cafetera cf, int cantidad){
        if (cf.getCapacidadMaxima()< (cantidad+cf.getCantidadActual())){
            System.out.println("Excede la capacidad máxima. Solo se agrega"+ (cf.getCapacidadMaxima()-cf.getCantidadActual()));
            cf.setCantidadActual(cf.getCapacidadMaxima());
        }else{
            cf.setCantidadActual(cf.getCantidadActual()+cantidad);
            System.out.println("La cantidad actual de café es: "+ cf.getCantidadActual());
        }
        
    }
    public double mostrar (Cafetera cf){
        return cf.getCantidadActual();
    }
    
}
