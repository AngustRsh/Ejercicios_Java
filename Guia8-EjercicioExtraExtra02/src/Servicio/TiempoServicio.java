/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Tiempo;
import java.util.Scanner;


public class TiempoServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Tiempo crearObjeto() {
        Tiempo objetoTiempo = new Tiempo();
        System.out.println("Ingrese una hora");
        objetoTiempo.setHora(leer.nextInt());
        System.out.println("Ingrese minutos");
        objetoTiempo.setMinutos(leer.nextInt());
        System.out.println("Ingrese segundos");
        objetoTiempo.setSegundos(leer.nextInt());
        
        return objetoTiempo;
    }
    
    public void restarHora(Tiempo objetoTiempo){
        objetoTiempo.setHora(objetoTiempo.getHora()-1);
    }
    
    public void restarMinutos(Tiempo objetoTiempo){
        objetoTiempo.setMinutos(objetoTiempo.getMinutos()-1);
    }
    
    public void restarSegundos(Tiempo objetoTiempo){
        objetoTiempo.setSegundos(objetoTiempo.getSegundos()-1);
    }
    
    public void imprimirHora(Tiempo objetoTiempo){
        for (int i = objetoTiempo.getHora(); i >= 0; i++) {
            if(objetoTiempo.getMinutos()==0){
                objetoTiempo.setMinutos(59);
            }
            for (int j = objetoTiempo.getMinutos(); j >= 0; j++) {
                
                if(objetoTiempo.getSegundos()==0){
                    objetoTiempo.setSegundos(59);
                }
                for (int k = objetoTiempo.getSegundos(); k >= 0; k++) {
                    System.out.println(objetoTiempo.getHora()+":"+objetoTiempo.getMinutos()+":"+objetoTiempo.getSegundos());
                    restarSegundos(objetoTiempo);
                }
                restarMinutos(objetoTiempo);
            }
            restarHora(objetoTiempo);
        }
    }
    
}
