/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Curso;
import java.util.Scanner;


public class CursoService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        //Metodo d)
    public void cargarAlumnos(Curso curso1) {
        
        
        String[] vectorAuxiliar = new String[5];
        
        for (int i = 0; i < curso1.getVectorAlumnos().length; i++) {
            System.out.println("Ingrese nombre del Alumno "+(i+1) +".");
            vectorAuxiliar[i]=leer.next();
        } 
        curso1.setVectorAlumnos(vectorAuxiliar);
    }
    
//Metodo e)
    public Curso crearCurso() {
        Curso curso1 = new Curso();
        
        System.out.println("Ingrese nombre del Curso:");
        curso1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia:");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana:");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Seleccione el turno: maniana/tarde");
        curso1.setTurno(leer.next());
        System.out.println("Ingrese precio por hora:");
        curso1.setPrecioPorHora(leer.nextDouble());
        this.cargarAlumnos(curso1);

        return curso1;
    }
    
    //Metodo f)
    public void calcularGanaciaSemana1(Curso curso1) {
        System.out.println("Las ganancias de la semana por curso, son:");
        System.out.println(curso1.getCantidadHorasPorDia()*curso1.getPrecioPorHora()*curso1.getCantidadDiasPorSemana()*5);
    } 
}
