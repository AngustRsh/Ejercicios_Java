/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author fer_c
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancariaServicio cs = new CuentaBancariaServicio();
        CuentaBancaria cb = cs.altaCuanta();
        cs.ingresoDinero(cb);
        cs.retiroDinero(cb);
        cs.extraccionRapida(cb);
        cs.consultaSaldo(cb);
        cs.consultaDatos(cb);
        
        
        
    }
    
}
