/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio06bis.porjuan;

import Servicio.CursoServicio;
import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;


public class Guia9Ejercicio06BisPorJuan {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CursoServicio cs=new CursoServicio();
        System.out.println("Ingrese cuantos cursos quiere ingresar.");
        int cant=leer.nextInt();
        Curso[] vectorCursos = new Curso [cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresar datos de curso "+(i+1));
            vectorCursos[i]=cs.crearCurso();
        }
        String opcion;
        int pers;
        do{
        System.out.println("MENU");
            System.out.println("A - Ver alumnos \n"
                    + "B - Ver ganancias \n"
                    + "C - Mostrar datos \n"
                    + "D - Salir \n");
            
         opcion = leer.next();

            switch (opcion.toUpperCase()) {
                case "A":
                    System.out.println("Ingrese el número de curso que quiere consultar.");
                    pers=leer.nextInt();
                    System.out.println("Los alumnos del curso '"+vectorCursos[pers-1].getNombreCurso()+"' son:");
                    
                        System.out.println(Arrays.toString(vectorCursos[pers-1].getAlumnos()));
                    
                    break;
                case "B":
                    System.out.println("Ingrese el número de curso que quiere consultar.");
                    pers=leer.nextInt();
                    System.out.println("Las ganancias semanales del curso '"+vectorCursos[pers-1].getNombreCurso()+"' son de un total de $"+cs.calcularGanancias(vectorCursos[pers-1]));
                    break;
                case "C":
                    System.out.println("Ingrese el número de curso que quiere consultar.");
                    pers=leer.nextInt();
                    System.out.println("---Datos del curso---");
                    cs.mostrarDatos(vectorCursos[pers-1]);
                    break;
                case "D":
                    System.out.println("Adios!!");
                    break;
                default:
                    break;
            }
        
        }while(!opcion.equalsIgnoreCase("D"));  
    }          
}