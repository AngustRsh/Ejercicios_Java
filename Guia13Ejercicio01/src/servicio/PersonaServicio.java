/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;


public class PersonaServicio {
    
      private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo b)
    public Persona crearPersona() {

        Persona pers = new Persona();

        System.out.println("Ingrese el nombre: ");
        pers.setNombre(leer.next());
        System.out.println("Ingrese edad: ");
        pers.setEdad(leer.nextInt());
        char sexo;
        do {
            System.out.println("Ingrese sexo ('H', 'M' , 'O'): ");
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        pers.setSexo(sexo);
        System.out.println("Ingrese peso:");
        pers.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura: ");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    //Metodo a)
    public boolean esMayorDeEdad(Persona pers) {
        
        return pers.getEdad() >= 18;
    }

    //Metodo c)
    public int calcularIMC(Persona pers) {
        double pesoIdeal = pers.getPeso() / (Math.pow(pers.getAltura(), 2));
        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal <= 25) {
            return 0;
        }
        return 1;
    }
    
    
}
