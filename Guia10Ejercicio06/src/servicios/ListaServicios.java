/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import entidades.Lista;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaServicios {
    HashMap<String,Integer> lista = new HashMap();
    Lista l1 = new Lista();
    
    public HashMap<String,Integer> menu () {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char respuesta='a' ;
        do {
        System.out.println("Menu de operaciones");
        System.out.println("Selecciones una opcion:");
        System.out.println("1- Ingresar Producto y Precio.");
        System.out.println("2- Modificar precio del producto.");
        System.out.println("3- Eliminar un producto de la lista.");
        System.out.println("4- Mostrar productos-precios.");
        System.out.println("5- Salir");
        int opc = leer.nextInt();
        
        switch  (opc){
            case 1:
                llenarLista(lista);
                break;
                
            case 2:
                modificarPrecio(lista);
                break;
            case 3:
                eliminarProducto(lista);
                break;
                
            case 4:
                mostrarProducto(lista);
                break;
                
            case 5:
                System.out.println("Desea salir? (S/N)");
                respuesta = leer.next().charAt(0);
                break;
        }        
        } while (!(respuesta == 's'));
        return lista;
    }
    
        public void llenarLista(HashMap<String,Integer> lista){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean confirmacion = true;
        
        do {            
            System.out.println("Ingrese Producto:");
            l1.setProducto(leer.next());
            System.out.println("Ingrese precio del producto");
            l1.setPrecio(leer.nextInt());
            
            lista.put(l1.getProducto(), l1.getPrecio());
            
            System.out.println("Desea agregar otro producto a la lista?");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;
            } 
        } while (confirmacion);
    }    
    
    public void modificarPrecio(HashMap<String,Integer> lista){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese producto que quiera modificar su precio:");
        String resp = leer.next();
        
        for (String producto: lista.keySet()) {
            if (resp.equalsIgnoreCase(producto)) {
                System.out.println("Ingrese nuevo precio del producto: ");
                l1.setPrecio(leer.nextInt());
                lista.replace(resp, l1.getPrecio());
                System.out.println("El precio del producto fue modificado.");
            }
        }
    }
    
    public void mostrarProducto(HashMap<String,Integer> lista){
        
        for (Map.Entry<String,Integer> entry: lista.entrySet()) {
            System.out.println("Producto:" +entry.getKey()+ " - Precio: " +entry.getValue());
        }
    }
    
    
    public void eliminarProducto(HashMap<String,Integer> lista){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese producto que deseea eliminar de la lista:");
        String eliminar = leer.next();      
                       
        lista.remove(eliminar);         
    }
    
}
