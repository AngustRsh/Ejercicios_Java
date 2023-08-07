/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;


public class CursoServicio {

    public Curso crearCurso(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Curso cursoObjeto=new Curso();
        
        System.out.println("---Ingrese el nombre del curso.---");
        cursoObjeto.setNombreCurso(leer.nextLine());
        System.out.println("---Ingrese el turno: Mañana/Tarde---");
        cursoObjeto.setTurno(leer.next());
        System.out.println("---Ingrese la cantidad de dias por semana que se da el curso.---");
        cursoObjeto.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("---Ingrese la cantidad de horas por día que se da el curso.---");
        cursoObjeto.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("---Ingrese la cantidad de dinero que cuesta cada hora del curso.---");
        cursoObjeto.setPrecioPorHora(leer.nextInt());
        System.out.println("---Ingresar nombre de alumnos---");
        this.cargarAlumnos(cursoObjeto);
        
        
        System.out.println("---Terminado---");
        return cursoObjeto;
    }
    
    public void cargarAlumnos(Curso cursoObjeto){
        Scanner leer = new Scanner(System.in);
        String[] estudiantes=new String[5];
            for(int i=0;i<5;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1));
            estudiantes[i]=leer.nextLine();
            }
        cursoObjeto.setAlumnos(estudiantes);
    }
    
    public double calcularGanancias(Curso cursoObjeto){
        double ganancias=cursoObjeto.getPrecioPorHora()*cursoObjeto.getCantidadHorasPorDia()*cursoObjeto.getCantidadDiasPorSemana()*5;
        
        return ganancias;
    }
    
    public void mostrarDatos(Curso cursoObjeto){
        System.out.println("Nombre del curso: "+cursoObjeto.getNombreCurso());
        System.out.println("Turno: "+cursoObjeto.getTurno());
        System.out.println("Cantidad de horas por dia: "+cursoObjeto.getCantidadHorasPorDia());
        System.out.println("Cantidad de dias por Semana: "+cursoObjeto.getCantidadDiasPorSemana());
        System.out.println("Alumnos: "); 
        System.out.println(Arrays.toString(cursoObjeto.getAlumnos()));
    }
}