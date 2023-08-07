/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package guia10.ejercicioextra02;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10EjercicioExtra02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        listaCantantes.add(new CantanteFamoso("Bruce Dickinson", "Seven son of the Seven Son"));
        listaCantantes.add(new CantanteFamoso("Andy Deris", "The Dark Ride"));
        listaCantantes.add(new CantanteFamoso("Michael Kiske", "Pumpkins"));
        listaCantantes.add(new CantanteFamoso("Juan", "Iron Maiden"));
        listaCantantes.add(new CantanteFamoso("Alberto Espineta", "La nina"));

        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println("Nombre del cantante: " + cantante.getCantante());
            System.out.println("Disco mas vendido: " + cantante.getDiscoConMasVentas());
        }

        int opc = 0;

        while (opc != 4) {
            System.out.println("Menu de operaciones");
            System.out.println("1- Agregar un cantante mas.");
            System.out.println("2- Mostrar todos los cantantes.");
            System.out.println("3- Eliminar un cantante de la lista.");
            System.out.println("4- Salir.");
            System.out.println("Seleccione una opcion:");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Introducir nombre del nuevo cantante:");
                    String nuevoCantante = leer.next();
                    System.out.println("Ingrese Disco mas vendido:");
                    String nuevoDisco = leer.next();
                    listaCantantes.add(new CantanteFamoso(nuevoCantante, nuevoDisco));
                    System.out.println("Cantante agregado exitosamente");
                    break;

                case 2:
                    System.out.println("Lista de cantantes y su disco mas vendido:");
                    for (CantanteFamoso aux : listaCantantes) {
                        System.out.println("Nombre del cantante: " + aux.getCantante());
                        System.out.println("Disco mas vendido: " + aux.getDiscoConMasVentas());
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el cantante que desea eliminar de la lista:");
                    String cantanteEliminar = leer.next();
                    CantanteFamoso cantanteEncontrado = null;
                    for (CantanteFamoso cantanteAux : listaCantantes) {
                        if (cantanteAux.getCantante().equals(cantanteEliminar)) {
                            cantanteEncontrado = cantanteAux;
                            break;
                        }
                    }
                    if (cantanteEncontrado != null) {
                        listaCantantes.remove(cantanteEncontrado);
                        System.out.println("El cantante fue eliminado exitosamente.");
                    } else {
                        System.out.println("El cantante no se encontro en la lista.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                    System.out.println("La opcion ingresada es incorrecta. Intentalo nuevamente");

            }
        }
    }
}
