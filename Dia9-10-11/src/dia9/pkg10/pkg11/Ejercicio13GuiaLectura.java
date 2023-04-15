/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.
 */
package dia9.pkg10.pkg11;

import java.util.Scanner;

public class Ejercicio13GuiaLectura {

    public static void main(String[] args) {
      
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de integrantes");
        int integrantes = leer.nextInt();
        leer.nextLine(); //agregue esto
        String[] vector = new String[integrantes];
        for (int i = 0; i < integrantes; i++) {
            System.out.println("Ingrese el participante Nro: "+ (i+1));
            vector[i] = leer.nextLine();
            //leer.nextLine();
            
        }
       
        //System.out.println("a escribir");
        
        for (int i = 0; i < integrantes; i++) {
            System.out.print("Participante nro: "+ (i+1) );
            System.out.println(" "+vector[i]);
            
        }
    }
}