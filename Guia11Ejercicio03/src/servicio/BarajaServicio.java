/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicio {

    Baraja baraja = new Baraja();
    Carta cartas = new Carta();
    ArrayList<Carta> monton = new ArrayList();
    ArrayList<Carta> mazo = new ArrayList();
    String[] palos = {"Espada", "Oro", "Basto", "Copa"};

    public ArrayList<Carta> crearBaraja() {

        for (int i = 0; i < palos.length; i++) {

            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {

                } else {
                    mazo.add(new Carta(j, palos[i]));
                }
            }
        }
        System.out.println("La baraja fue creada con exito");
        baraja.setMazoCartas(mazo);
        return mazo;
    }

    public void barajar() {
        Collections.shuffle(mazo);
        System.out.println("La baraja fue mezclada");
        
    }

    public void siguienteCarta() {
        if (baraja.getMazoCartas().size() > 1) {
            System.out.println("La carta siguiente es " + baraja.getMazoCartas().get(0));
            monton.add(baraja.getMazoCartas().remove(0));

        } else if (baraja.getMazoCartas().size() == 1) {
            System.out.println("La carta siguiente es " + baraja.getMazoCartas().get(0));
            System.out.println("Ultima carta");
            monton.add(baraja.getMazoCartas().remove(0));
        }
    }

    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas que se pueden repartir son: " + baraja.getMazoCartas().size());
    }

    public void darCartas() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad que desea recibir de cartas: ");
        int cantidadRecibir = leer.nextInt();

        if (cantidadRecibir > baraja.getMazoCartas().size()) {
            System.out.println("No es posible entregar esa cantidad de cartas");

        } else {
            for (int i = 0; i < cantidadRecibir; i++) {
                siguienteCarta();
            }
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavia");
        } else {
            for (Carta cartaAux : monton) {
                System.out.println(cartaAux);
            }
        }
    }

    public void mostrarBaraja() {

        for (Carta mazoCartaAux : baraja.getMazoCartas()) {
            System.out.println(mazoCartaAux);
        }
    }

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion = true;

        do {
            System.out.println("Menu de operaciones");
            System.out.println("Selecciones una opcion:");
            System.out.println("1- Crear Baraja de Cartas");
            System.out.println("2- Barajar Cartas");
            System.out.println("3- Repartir Siguiente Carta");
            System.out.println("4- Cartas Disponibles que aun se pueden repartir");
            System.out.println("5- Dar Cartas Pedidas");
            System.out.println("6- Mostrar Cartas descartadas");
            System.out.println("7- Mostrar Baraja");
            System.out.println("8- Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                        crearBaraja();
                    break;

                case 2:
                        barajar();
                    break;

                case 3:
                        siguienteCarta();
                    break;

                case 4:
                        cartasDisponibles();
                    break;

                case 5:
                        darCartas();
                    break;

                case 6:
                        cartasMonton();
                    break;

                case 7:
                        mostrarBaraja();
                    break;

                case 8:
                        confirmacion = false;
                    break;
            }

        } while (confirmacion);
    }
}