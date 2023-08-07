/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
    Ahorcado ah = new Ahorcado();
    String[] arrayAux;
    int indiceArray = 0;

    private void crearJuego() {

        System.out.println("Ingrese la palabra");
        String aux = leer.next();
        String[] vector = new String[aux.length()];
        arrayAux = new String[vector.length];

        for (int i = 0; i < aux.length(); i++) {
            vector[i] = aux.substring(i, i + 1);
        }
        ah.setPalabra(vector);
        System.out.println("Cantidad de intentos");
        ah.setJugadasMaximas(leer.nextInt());
        ah.setLetrasEncontradas(0);
    }

    /*
    Método longitud(): muestra la longitud de la 
    palabra que se debe encontrar. Nota: buscar 
    como se usa el vector.length.
     */
    private void longitud() {
        System.out.println("La longitud de la palabra a encontrar es " + ah.getPalabra().length);
    }

    /*
    Método buscar(letra):  este método recibe una letra 
    dada por el usuario y busca si la letra ingresada es 
    parte de la palabra o no. También informará si la letra 
    estaba o no.
     */
    private boolean buscar(String letra) {
        boolean salida = false;
        for (String palabra : ah.getPalabra()) {
            if (letra.equals(palabra)) {
                salida = true;
                break;
            } else {
                salida = false;
            }
        }
        return salida;
    }

    /*
    Método encontradas(letra):  que reciba una letra 
    ingresada por el usuario y muestre cuantas letras 
    han sido encontradas y cuántas le faltan. Este método 
    además deberá devolver true si la letra estaba y false 
    si la letra no estaba, ya que, cada vez que se busque una 
    letra que no esté, se le restará uno a sus oportunidades.
     */
    private boolean encontradas(String letra) {
        int contador = 0;
        boolean repetida = false;
        for (String palabra : arrayAux) {
            if (letra.equals(palabra)) {
                System.out.println("La letra ya fue encontrada con anterioridad. Pierde un turno");
                ah.setJugadasMaximas(ah.getJugadasMaximas() - 1);
                repetida = true;
                break;
            }
        }

        if (buscar(letra) && !repetida) {
            System.out.println("La letra si está");
            arrayAux[indiceArray] = letra;
            indiceArray++;
            for (String palabra1 : ah.getPalabra()) {
                if (letra.equals(palabra1)) {
                    contador++;
                }
            }
        } else if (!repetida) {

            System.out.println("La letra " + letra + " no está");
            ah.setJugadasMaximas(ah.getJugadasMaximas() - 1);
        }
        ah.setLetrasEncontradas(ah.getLetrasEncontradas() + contador);
        if (ah.getPalabra().length - ah.getLetrasEncontradas() != 0) {
            System.out.println("Le faltan adivinar " + (ah.getPalabra().length - ah.getLetrasEncontradas()) + " letras");
        }
        return buscar(letra);
    }

    /*
    Método intentos(): para mostrar cuántas
    oportunidades le queda al jugador.
     */
    private void intentos() {
        if (ah.getPalabra().length - ah.getLetrasEncontradas() != 0) {
            System.out.println("Le quedan " + ah.getJugadasMaximas() + " intentos");
        }
    }

    /*
    Método juego(): el método juego se encargará 
    de llamar todos los métodos previamente mencionados
    e informará cuando el usuario descubra toda la palabra 
    o se quede sin intentos. Este método se llamará en el main.

     */
 /*
    crearJuego()
    longitud()
    encontradas(letra)
    intentos()
     */
    public void juego() {
        crearJuego();
        longitud();
        boolean fin = false;
        do {
            System.out.println("Ingrese una letra");
            encontradas(leer.next());
            intentos();
            if (ah.getJugadasMaximas() == 0) {
                System.out.println("Perdiste!!! ");
                fin = true;
            }
            if (ah.getLetrasEncontradas() == ah.getPalabra().length) {
                System.out.println("Ganaste!!! ");
                fin = true;
            }
            if (fin) {
                System.out.print("La palabra es: ");
                for (String palabra : ah.getPalabra()) {
                    System.out.print(palabra);
                }
                System.out.println("");
            }

        } while (!fin);

    }

}
