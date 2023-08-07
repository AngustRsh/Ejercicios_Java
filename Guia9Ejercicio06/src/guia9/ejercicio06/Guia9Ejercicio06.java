/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.ejercicio06;

import Servicio.CursoService;
import entidades.Curso;


public class Guia9Ejercicio06 {

    public static void main(String[] args) {
       
        CursoService miCursoService = new CursoService();
        Curso curso1 = miCursoService.crearCurso();

        miCursoService.calcularGanaciaSemana1(curso1);
    }
}
