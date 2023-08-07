/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.ejercicio02;

import entidades.Alumno;
import java.util.ArrayList;
import servicio.AlumnoService;

public class Guia10Ejercicio03 {

    public static void main(String[] args) {

        AlumnoService miAlumnoServicio = new AlumnoService();

        ArrayList<Alumno> alumnos = miAlumnoServicio.crearListaAlumnos();

        System.out.println(alumnos);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());

        }
    }
}
