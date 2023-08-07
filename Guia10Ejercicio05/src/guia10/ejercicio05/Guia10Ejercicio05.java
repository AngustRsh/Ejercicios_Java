/*
 (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package guia10.ejercicio05;

import entidades.Pais;
import java.util.HashSet;
import servicio.PaisServicio;


public class Guia10Ejercicio05 {

   
    public static void main(String[] args) {
        
        PaisServicio miPaisServicio = new PaisServicio();
        HashSet<Pais> paises = miPaisServicio.crearPais();

        System.out.println("----------------------");
        
        System.out.println("Paises Ordenados Alfabeticamente:");
        miPaisServicio.mostrarOrdenAlfa(paises);
        
        System.out.println("----------------------");
        
        miPaisServicio.eliminarPais(paises);
    }
    
}
