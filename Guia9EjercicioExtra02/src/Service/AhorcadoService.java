/*
Definir los siguientes métodos en AhorcadoService:
a) Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas 
y el valor que ingresó el usuario.
b) Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.
c) Método buscar(letra):  este método recibe una letra dada por el usuario
y busca si la letra ingresada es parte de la palabra o no. También informará
si la letra estaba o no.
d) Método encontradas(letra):  que reciba una letra ingresada por el usuario y
muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además
deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada
vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
e) Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
f) Método juego(): el método juego se encargará de llamar todos los métodos previamente
mencionados e informará cuando el usuario descubra toda la palabra o se quede sin 
intentos. Este método se llamará en el main.
 */
package Service;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado objetoAhorcado = new Ahorcado();
    String[] arrayAux;
    int indiceArray = 0;

    //Metodo a)
    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar:");
        String auxiliar = leer.next();
        
        System.out.println("Ingrese la cantidad maxima de intentos:");
        objetoAhorcado.setCantidadJugadasMaximas(leer.nextInt());
        
        String[] vector = new String[auxiliar.length()];
        arrayAux = new String[vector.length];

        for (int i = 0; i < auxiliar.length(); i++) {
            vector[i] = auxiliar.substring(i,i+1);
        }
        objetoAhorcado.setPalabraBuscar(vector);
    }

    //Metodo b)
    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es de: " +objetoAhorcado.getPalabraBuscar().length); 
    }
    
    //Metodo c)
    public boolean buscar(String letra) {
        boolean letraEncontrada = false;
       
        for (String palabraBuscar : objetoAhorcado.getPalabraBuscar()) {
            if (letra.equals(palabraBuscar)) {
                letraEncontrada = true;
                break;
            }else {               
                letraEncontrada = false;
            }
        }
        return letraEncontrada ;
    }

    //Metodo d)
    public boolean encontradas(String letra) {
      int contador = 0;
        boolean repetida = false;
        for (String palabra : arrayAux) {
            if (letra.equals(palabra)) {
                System.out.println("La letra ya fue encontrada con antes");
                objetoAhorcado.setCantidadJugadasMaximas(objetoAhorcado.getCantidadJugadasMaximas()-1);
                repetida = true;
                break;
            }
        }

        if (buscar(letra) && !repetida) {
            System.out.println("La letra si esta en la palabra");
            arrayAux[indiceArray] = letra;
            indiceArray++;
            for (String palabra1 : objetoAhorcado.getPalabraBuscar()) {
                if (letra.equals(palabra1)) {
                    contador++;
                }
            }
        } else if (!repetida) {

            System.out.println("La letra " + letra + " no esta en la palabra");
            objetoAhorcado.setCantidadJugadasMaximas(objetoAhorcado.getCantidadJugadasMaximas()-1);
        }
        objetoAhorcado.setCantidadLetrasEncontradas(objetoAhorcado.getCantidadLetrasEncontradas()+contador);
        if (objetoAhorcado.getPalabraBuscar().length - objetoAhorcado.getCantidadLetrasEncontradas() != 0) {
            System.out.println("Le faltan adivinar " + (objetoAhorcado.getPalabraBuscar().length - objetoAhorcado.getCantidadLetrasEncontradas()) + " letras");
        }
        return buscar(letra);
    }
    
    //Metodo e)
    public void intentos() {
     if (objetoAhorcado.getPalabraBuscar().length - objetoAhorcado.getCantidadLetrasEncontradas() != 0) {
            System.out.println("Le quedan " + objetoAhorcado.getCantidadJugadasMaximas() + " intentos");
        }
    }
    
    //Metodo f)
     public void juego() {
        crearJuego();
        longitud();
        boolean fin = false;
        do {
            System.out.println("Ingrese una letra");
            encontradas(leer.next());
            intentos();
            if (objetoAhorcado.getCantidadJugadasMaximas() == 0) {
                System.out.println("No te quedan intentos. Has perdido ");
                fin = true;
            }
            if (objetoAhorcado.getCantidadLetrasEncontradas() == objetoAhorcado.getPalabraBuscar().length) {
                System.out.println("Has adivinado la palabra ");
                fin = true;
            }
            if (fin) {
                System.out.print("La palabra es: ");
                for (String palabra : objetoAhorcado.getPalabraBuscar()) {
                    System.out.print(palabra);
                }
                System.out.println("");
            }
        } while (!fin);
    }
}
