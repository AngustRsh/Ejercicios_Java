/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto.
 */
package servicio;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {

    public HashSet<Pais> crearPais() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Pais> paises = new HashSet();
        boolean confirmacion = true;

        do {
            Pais pais = new Pais();
            System.out.println("Ingrese pais:");
            pais.setNacionalidad(leer.next());
            paises.add(pais);

            System.out.println("Desea agregar otro pais?(S/N)");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;

                for (Pais paisAux : paises) {
                    System.out.println(paisAux.getNacionalidad());
                }
            }
        } while (confirmacion);
        return paises;
    }

//    Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
    public void mostrarOrdenAlfa(HashSet<Pais> paises) {
        ArrayList<Pais> paisLista = new ArrayList(paises);
        paisLista.sort(Pais.ordenar);
        for (Pais pais : paisLista) {
            System.out.println(pais.getNacionalidad());
        }
    }

//   Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    public void eliminarPais(HashSet<Pais> paises) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confrimacion = true;
        System.out.println("Ingrese Pais a quitar de la lista:");
        String paisQuitar = leer.next();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            Pais paisAuxiliar = it.next();
            if (paisAuxiliar.getNacionalidad().equalsIgnoreCase(paisQuitar)) {
                it.remove();
                mostrarOrdenAlfa(paises);
                confrimacion = false;
            }
        }
        if (confrimacion) {
            System.out.println("El Pais no se encuentra en la lista.");
        }
    }
}
