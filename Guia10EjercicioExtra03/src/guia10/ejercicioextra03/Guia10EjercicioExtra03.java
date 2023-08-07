/*
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
 */
package guia10.ejercicioextra03;

import entidades.Libro;
import java.util.Scanner;
import servicio.Libreria;




public class Guia10EjercicioExtra03 {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese el número de ejemplares: ");
            int ejemplares = Integer.parseInt(scanner.nextLine());

            Libro libro = new Libro(titulo, autor, ejemplares);
            libreria.getLibros().add(libro);

            System.out.print("¿Desea agregar otro libro? (s/n): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("\n=== Biblioteca ===");
        System.out.println(libreria.toString());

        System.out.print("Ingrese el título del libro a prestar: ");
        String tituloPrestamo = scanner.nextLine();
        if (libreria.prestamo(tituloPrestamo)) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No se puede realizar el préstamo.");
        }

        System.out.print("Ingrese el título del libro a devolver: ");
        String tituloDevolucion = scanner.nextLine();
        if (libreria.devolucion(tituloDevolucion)) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No se puede realizar la devolución.");
        }
    }
}