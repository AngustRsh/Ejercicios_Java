/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Persona implements SerVivo {
    
    @Override
    public void nombrePersona(){    //sobreescribe en el metodo abstracto de la interface
        System.out.println("Nahuel");
    }
    
}
