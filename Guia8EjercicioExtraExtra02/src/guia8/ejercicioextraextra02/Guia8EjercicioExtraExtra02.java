/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicioextraextra02;

import Servicio.TiempoServicio;
import entidades.Tiempo;


public class Guia8EjercicioExtraExtra02 {

  
    public static void main(String[] args) {
        
        TiempoServicio miTiempoServicio = new TiempoServicio();
        Tiempo miTiempo = miTiempoServicio.crearObjeto();
        
        miTiempoServicio.imprimirHora(miTiempo);
        
        
    }
    
}

// FALTA TERMINAR, PONER PAUSA Y QUE NO PASE LOS 60 SEGUNDOS NI MINUTOS.