/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.ejerciciosextra04;

import entidades.Cuenta;


public class Guia7EjerciciosExtra04 {

   
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta();
        
        c1.setSaldo(10000);
        c1.setTitular("Juan");
        
       c1.retirar_dinero();
       
    }
    
}
