/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rigenk
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);

    Ahorcado ahorcado1 = new Ahorcado();

    private void crearJuego() {

        String palabra1;

        System.out.println("");
        System.out.println("-------------------  * * * * crearJuego * * * * -------------- ");

        System.out.println("Ingrese la palabra a adivinar");
        palabra1 = leer.next();

        String[] palabraVector1 = new String[palabra1.length()];
        String[] palabraVector2 = new String[palabra1.length()];

        for (int i = 0; i < palabraVector1.length; i++) {
            palabraVector1[i] = palabra1.substring(i, i + 1);
            palabraVector2[i] = "_";
        }

        ahorcado1.setPalabraElegida(palabraVector1);
        ahorcado1.setPalabraCompletada(palabraVector2);

        System.out.println("Ingrese la cantidad maxima de oportunidades para ingresar una letra");
        ahorcado1.setOportunidades(leer.nextInt());
        ahorcado1.setLetrasEncontrada(0);
    }

    public void longitud() {

        System.out.println("");
        //System.out.println("--------------------------- * * * * longitud * * * *  ------------------");

        System.out.println("La longitud de la palabra es: " + ahorcado1.getPalabraElegida().length);
    }

    public int buscar(String letraIngresada, int cuentaLetra) {
        System.out.println("");
        System.out.println("--------------------------- * * * * buscar * * * *  ------------------");

        String[] palabraVector1 = ahorcado1.getPalabraElegida();
        String[] palabraVector2 = ahorcado1.getPalabraCompletada();

        for (int i = 0; i < palabraVector1.length; i++) {
            
            if (letraIngresada.equals((palabraVector1[i]))) {
                System.out.println("La letra '" + letraIngresada + "' esta en la palabra en posición: "+(i+1));
                palabraVector2[i] = palabraVector1[i];
                cuentaLetra++;
            }
            
            
        }
        
        if (cuentaLetra ==0) {
                   System.out.println("La letra '" + letraIngresada + "' no es parte de la palabra");
        }
        
        ahorcado1.setPalabraCompletada(palabraVector2);

        return cuentaLetra;
    }

    public boolean encontradas(String letraIngresada) {
        System.out.println("");
        //System.out.println("--------------------------- * * * * encontradas * * * *  ------------------");

        int cuentaLetra;
        boolean estaEnPalabra = false;

        cuentaLetra = buscar(letraIngresada, 0);

        ahorcado1.setLetrasEncontrada(ahorcado1.getLetrasEncontrada() + cuentaLetra);
        System.out.println("Letras encontradas actualmente: " + ahorcado1.getLetrasEncontrada());
        System.out.println("Letras restantes: " + (ahorcado1.getPalabraElegida().length - ahorcado1.getLetrasEncontrada()));

        if (cuentaLetra > 0) {
            estaEnPalabra = true;
        }

        return estaEnPalabra;
    }

    public void intentos() {
        System.out.println("Oportunidades restantes: " + ahorcado1.getOportunidades());
    }

    public void juego() {

        System.out.println("");
        System.out.println("--------------------------- * * * * Juego * * * *  ------------------");

        crearJuego();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        String letraIngresada;

        boolean letraEncontrada = false;
        boolean gano = false;

        do {

            if ( Arrays.equals(ahorcado1.getPalabraElegida(),
                ahorcado1.getPalabraCompletada())
            
                ) {
                gano = true;
                break;
            }else {
                
                
                for (int i = 0; i < ahorcado1.getPalabraCompletada().length; i++) {                    
                    System.out.print(" "+ahorcado1.getPalabraCompletada()[i]);
                }
                
                System.out.println("");
                System.out.println("");
                System.out.println("Ingrese una letra de la palabra");
                letraIngresada = leer.next().substring(0, 1);
                longitud();
                
                letraEncontrada = encontradas(letraIngresada);
                
                
                if (letraEncontrada == false) {
                    ahorcado1.setOportunidades(ahorcado1.getOportunidades()-1);
                }
                System.out.println("Oportunidades restante : " + ahorcado1.getOportunidades());
                
                
            }

        } while (!(ahorcado1.getOportunidades() == 0) || gano == true);
        
        if (gano == true) {
            System.out.println("");
            System.out.println("Ganador");
        } else  {
            System.out.println("");
            System.out.println("Ahorcado!");
        }
    }

}
