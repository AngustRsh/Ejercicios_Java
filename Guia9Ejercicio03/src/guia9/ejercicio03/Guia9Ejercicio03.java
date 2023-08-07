/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
arreglo B de 20 números reales.
 */
package guia9.ejercicio03;

import Servicio.ArregloService;

public class Guia9Ejercicio03 {

    public static void main(String[] args) {

        ArregloService miArregloService = new ArregloService();

        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        miArregloService.inicializarA(vectorA);
        miArregloService.mostrarA(vectorA);
        miArregloService.ordenar(vectorA);
        miArregloService.inicializarB(vectorA, vectorB);
    }
}
