package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class AdoptarMascotaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("NUEVA PERSONA");
        System.out.print("Nombre.......:");
        String nombre = leer.next();
        System.out.print("Apellido.....:");
        String apellido = leer.next();
        System.out.print("Edad.........:");
        Integer edad = leer.nextInt();
        System.out.print("Documento....:");
        Integer documento = leer.nextInt();
        return new Persona(nombre, apellido, edad, documento, null);
    }

    public Perro crearPerro() {
        System.out.println("NUEVO PERRO");
        System.out.print("Nombre.......:");
        String nombre = leer.next();
        System.out.print("Edad.........:");
        Integer edad = leer.nextInt();
        System.out.print("Raza.........:");
        String raza = leer.next();
        System.out.print("Tamanio......:");
        Integer tamanio = leer.nextInt();
        return new Perro(nombre, raza, edad, tamanio);
    }
    
    public void adptarPerrito(Persona p1, Persona p2, Perro m1, Perro m2){
        Persona personaJoven, personaPasadita;
        if (p1.getEdad()>p2.getEdad()) {
            personaPasadita = p1;
            personaJoven = p2;
        } else {
            personaPasadita = p2;
            personaJoven = p1;
        }
        
        if (m1.getEdad()>m2.getEdad()) {
            p1.setPerritoAdoptado(m1);
            p2.setPerritoAdoptado(m2);
        } else {
            p1.setPerritoAdoptado(m2);
            p2.setPerritoAdoptado(m1);
        }
    }

}
