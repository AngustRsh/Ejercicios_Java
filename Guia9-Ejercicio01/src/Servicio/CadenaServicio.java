/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
f)Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Servicio;

import entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Creacion del objeto
    public Cadena crearCadena() {
        Cadena objetoCadena = new Cadena();

        System.out.println("Ingrese una frase");
        objetoCadena.setFrase(leer.next());

        return objetoCadena;
    }

    //Metodo a)
    public void mostrarVocales (Cadena objetoCadena) {
 
       int contador = 0;
       
        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++) {
        char vocal = objetoCadena.getFrase().charAt(i);
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " +contador);
    }


//    public int mostarVocales(Cadena objetoCadena) {
//        int contador = 0;
//
//        for (int i = 0; i < objetoCadena.getLongitudFrase(); i++);
//        {
//            char nuevo = objetoCadena.getFrase().charAt(i);
//
//            if (nuevo == 'a' || nuevo == 'A') {
//
//                nuevo = 'a';
//                contador++;
//
//            } else if (nuevo == 'e' || nuevo == 'E') {
//
//                nuevo = 'e';
//                contador++;
//
//            } else if (nuevo == 'i' || nuevo == 'I') {
//
//                nuevo = 'i';
//                contador++;
//
//            } else if (nuevo == 'o' || nuevo == 'O') {
//
//                nuevo = 'o';
//                contador++;
//
//            } else if (nuevo == 'u' || nuevo == 'U') {
//
//                nuevo = 'u';
//                contador++;
//            }
//        }
//        return contador;
//    }

    //Metodo b)
    public void invertirFrase(Cadena objetoCadena) {

		// Crear un StringBuilder a partir de la cadena
		StringBuilder stringBuilder = new StringBuilder(objetoCadena.getFrase());
		// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
		String invertida = stringBuilder.reverse().toString();
		System.out.println("Cadena original: " + objetoCadena.getFrase());
		System.out.println("Cadena invertida: " + invertida);

	}
    
}
    
    
    
    

