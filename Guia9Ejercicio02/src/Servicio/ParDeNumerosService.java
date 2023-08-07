/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá 
además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicio;

import Entidades.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double mayor = 0;
    double menor = 0;
    
    public ParDeNumeros crearNumeros() {
        ParDeNumeros objetoParNumeros = new ParDeNumeros();

        return objetoParNumeros;
    }

    //Metodo a)
    public void mostrarValores(ParDeNumeros objetoParNumeros) {
        System.out.println("El primer numero al azar es: " + objetoParNumeros.getNum1());
        System.out.println("El segundo numero al azar es: " + objetoParNumeros.getNum2());
    }

    //Metodo b)
    public void devolverMayor(ParDeNumeros objetoParNumeros) {
        if (objetoParNumeros.getNum1() > objetoParNumeros.getNum2()) {
            mayor = objetoParNumeros.getNum1() ;
            menor = objetoParNumeros.getNum2() ;
            System.out.println(mayor + " es mayor que " + menor);

        } else if (objetoParNumeros.getNum1() < objetoParNumeros.getNum2()) {
            mayor = objetoParNumeros.getNum2() ;
            menor = objetoParNumeros.getNum1() ;
            System.out.println(mayor + " es mayor que " + menor);
        } else {
            System.out.println("Ambos numeros son identicos");
        }
    }
        //Metodo c)
    public void calcularPotencia(ParDeNumeros objetoParNumeros) {
        System.out.println("La potencia es: ");
        System.out.println(Math.pow(Math.round(mayor), Math.round(menor))) ;
    }

    //Metodo d)
    public void calculaRaiz(ParDeNumeros objetoParNumeros) {
        System.out.println("el valor absoluto del menor numero es: "+Math.abs(menor));
        System.out.println("Su raiz cuadrada es: ");
        System.out.println(Math.sqrt(Math.abs(menor)));
    }
    

//    d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
}
