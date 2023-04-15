/*
    Dada una cantidad de grados centígrados se debe mostrar su 
    equivalente en grados Fahrenheit. La fórmula correspondiente es: 
    F = 32 + (9 * C / 5).
 */
package dia1.ejercicios;

import java.util.Scanner;


public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        double gradosC,gradosF;
        
        System.out.println("Ingrese una temperatura en grados Centígrados: ");
        gradosC= numero.nextDouble();
        
        gradosF=32+(9*gradosC/5);
        
        System.out.println("Los " +gradosC+ " equivalen a " +gradosF+ " grados Fahrenheit" );
    
    }
    
}
