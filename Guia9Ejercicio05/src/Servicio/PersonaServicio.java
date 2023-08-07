/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Angust Rush
 */
public class PersonaServicio {
    
 Persona per1 = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //MÃ©todo crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
    //Retornar el objeto Persona creado.

    public Persona crearPersona() {

        System.out.println("Ingrese el nombre de la persona:");
        per1.setNombre(leer.next());
        System.out.println("Ingrese el aÃ±o");
        int anio = leer.nextInt() - 1900;
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        Date n = new Date(anio, mes, dia);

        per1.setFechaN(n);
        return per1;
    }

    //MÃ©todo calcularEdad que calcule la edad del usuario utilizando el atributo de
    //fecha de nacimiento y la fecha actual.
    public int calcularEdad(Persona per1) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - per1.getFechaN().getYear();
        return edad;
    }

    //MÃ©todo menorQue recibe como parÃ¡metro una Persona y una edad. Retorna true si la persona
    //es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(Persona per1) {
        System.out.println("Ingrese una edad para comparar: ");
        int numConsultar = leer.nextInt();
        return calcularEdad(per1) < numConsultar;

    }

    //MÃ©todo mostrarPersona que muestra la informaciÃ³n de la persona deseada.
    public void mostrarPersona(Persona per1) {

        System.out.println("El nombre de las personas es: " + per1.getNombre());
        System.out.println("La fecha de nacimiento es: " + per1.getFechaN().getDate() + "/" + per1.getFechaN().getMonth() + "/" + per1.getFechaN().getYear());
        System.out.println("La edad de la persona es: "+calcularEdad(per1));
        System.out.println(menorQue(per1));
    }

}