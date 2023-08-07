package g11.practica.pkg1;

import entidad.Persona;
import entidad.Perro;
import servicio.AdoptarMascotaServicio;

public class G11Practica1 {

    public static void main(String[] args) {
        AdoptarMascotaServicio puente = new AdoptarMascotaServicio();
        
        Persona p1 = new Persona();
        Perro m1 = new Perro();
        
        
        Persona p2 = new Persona();
        Perro m2 = new Perro();
        
        System.out.println("CARGAR PERSONA 1.........");
        p1= puente.crearPersona();
        System.out.println("CARGAR PERSONA 2.........");
        p2= puente.crearPersona();
        
        System.out.println("CARGAR PERRITO 1.........");
        m1= puente.crearPerro();
        System.out.println("CARGAR PERRITO 2.........");
        m2= puente.crearPerro();
        
        System.out.println("Adoptanding....");
        puente.adptarPerrito(p1, p2, m1, m2);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        
    }
}
