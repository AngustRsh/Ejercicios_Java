/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
jugadores jugar un juego de adivinanza de números. El primer jugador elige un 
número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número
limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada
intento. El juego termina cuando el segundo jugador adivina el número o se queda 
sin intentos. Registra el número de intentos necesarios para adivinar el número y 
el número de veces que cada jugador ha ganado.
 */
package entidades;

import java.util.Scanner;

public class Juego {

    private int num1;
    private int num2;
    private int intentosJugador2;
    private int ganadosJ1;
    private int ganadosJ2;

    //Constructores
    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Metodo get y set num1
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    //Metodo get y set num2
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //Metodo get y set intentos jugador 2

    public int getIntentosJugador2() {
        return intentosJugador2;
    }

    public void setIntentosJugador2(int intentosJugador2) {
        this.intentosJugador2 = intentosJugador2;
    }

    //Metodo get y set ganados jugador1
    public int getGanadosJ1() {
        return ganadosJ1;
    }

    public void setGanadosJ1(int ganadosJ1) {
        this.ganadosJ1 = ganadosJ1;
    }

    //Metodo get y set ganados jugador2
    public int getGanadosJ2() {
        return ganadosJ2;
    }

    public void setGanadosJ2(int ganadosJ2) {
        this.ganadosJ2 = ganadosJ2;
    }

    //Metodo iniciar juego
    public void inicar_juego() {

        Scanner leer = new Scanner(System.in);

        boolean continuar = true;
        String respuesta;

        while (continuar) {

            System.out.println("Jugador 1....");
            System.out.println("Por favor elegir un numero a adivinar: ");
            this.num1 = leer.nextInt();

            System.out.println("Jugador 2 tenes 5 intentos para adivinarlo");

            intentosJugador2 = 0;

            System.out.println("Jugador 2, ingrese un numero para adivinar: ");

            while (intentosJugador2 < 5) {

                this.num2 = leer.nextInt();
                intentosJugador2++;

                if (this.num2 == this.num1) {
                    System.out.println("Adivinaste el numero!!");
                    ganadosJ2++;
                    break;

                } else if (this.num2 < this.num1) {

                    System.out.println("Mas alto");

                } else {

                    System.out.println("Mas bajo");

                }
            }

            if (intentosJugador2 == 5) {
                System.out.println("Perdiste, te quedaste sin intentos.");

                ganadosJ1++;

            }

            System.out.println("Tabla de puntuacion: ");
            System.out.println("Jugador 1 tiene " + ganadosJ1 + " ganados.");
            System.out.println("Jugador 2 tiene " + ganadosJ2 + " ganados.");

            System.out.println("---------------");
            
            
            System.out.println("Seguir jugando? (s/n)? ");
            respuesta = leer.next();
            
           continuar = respuesta.equalsIgnoreCase("s");
            
           
        }

        System.out.println("Marcador Final:");
        System.out.println("Jugador 1 tiene " + ganadosJ1 + " ganados.");
        System.out.println("Jugador 2 tiene " + ganadosJ2 + " ganados.");
    }

}
