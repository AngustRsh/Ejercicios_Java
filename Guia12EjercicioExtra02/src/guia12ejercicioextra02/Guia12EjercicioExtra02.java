/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12ejercicioextra02;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;


public class Guia12EjercicioExtra02 {

 
    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList<>();
        
        edificios.add(new Polideportivo("Polideportivo 1", "Techado", 60, 30, 10));
        edificios.add(new Polideportivo("Polideportivo 2", "Abierto", 20, 10, 8));
        
        edificios.add(new EdificioDeOficinas(10, 50, 4, 15, 3, 20));
        edificios.add(new EdificioDeOficinas(5, 20, 3, 20, 4, 10));
        
        for (Edificio edificioAux : edificios) {
            System.out.println("Superficie del edificio: " + edificioAux.calcularSuperficie());
            System.out.println("Volumen del edificio: " + edificioAux.calcularVolumen());
            
            if (edificioAux instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificioAux;
                System.out.println(polideportivo.getNombre());
                System.out.println("Tipo de instalacion: " + polideportivo.getTipoInstalacion());
                
            } else if (edificioAux instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificioAux;
                edificioDeOficinas.cantPersonas();
                
            }
            
            System.out.println();
        }

    }
    
}
