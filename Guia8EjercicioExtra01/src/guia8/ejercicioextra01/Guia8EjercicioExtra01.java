/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicioextra01;


import Entidades.Raices;
import Servicio.RaicesServicio;


public class Guia8EjercicioExtra01 {


    public static void main(String[] args) {
        
        RaicesServicio rcs = new RaicesServicio();
        
        Raices rc = rcs.getDiscriminante();
       
        rcs.calcular(rc);
    }
    
}
