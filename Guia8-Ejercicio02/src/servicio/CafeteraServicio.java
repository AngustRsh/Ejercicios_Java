/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño
de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero. 
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se
añade a la cafetera la cantidad de café indicada.

 */
package servicio;

import java.util.Scanner;
import entidades.Cafetera;


public class CafeteraServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Metodo a)
    
    public Cafetera llenarCafetera() {
        
        Cafetera cft = new Cafetera();
        
        System.out.println("Ingrese la capacidad maxima de la cafetera :");
        cft.setCapacidadMaxima(leer.nextInt());
        
        cft.setCantidadActual(cft.getCapacidadMaxima());
        
        System.out.println("La cafetera tiene : " +cft.getCantidadActual()+ " mililitros");
        return cft;
    }
    
    // Metodo b)
    public void servirTaza (Cafetera cft) {
        
        System.out.println("Ingresar tamano de la taza: ");
        int tamano = leer.nextInt();
        
        if (cft.getCantidadActual() < tamano) {
            
            System.out.println("La taza no llego a llenarse. Tiene : " +cft.getCantidadActual()+ " ml.");
            
        } else  {
            System.out.println("La taza se lleno. Tiene " +tamano+ " ml.");
            cft.setCantidadActual(cft.getCantidadActual()-tamano);
        }   
    }
    
    //Metodo c)
    public void vaciarCafetera(Cafetera cft) {
        System.out.println("La cafetera se vacio." );
        cft.setCantidadActual(0);
    }
    
    //Metodo d)
    public void agregarCafe (Cafetera cft) {
        
        System.out.println("Ingrese una cantidad de cafe: ");
        int cafeagregado = leer.nextInt();
        
        if (cft.getCantidadActual()+cafeagregado < cft.getCapacidadMaxima()) {
            
            cft.setCantidadActual(cft.getCantidadActual()+cafeagregado);
        } else  {
            System.out.println("Esa cantidad de cafe para agregar, sobrepasa el limite maximo de la cafetera.");
        }

    }
    
    public void capaActual(Cafetera cft) {
        System.out.println(cft.getCantidadActual());
    }
}
