/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicios_Guia_Encuentro4al6;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena;
        int correcta = 0, incorrecta = 0;

        do {
            System.out.println(" Ingresar una cadena de texto o '&&&&&' para finalizar");
            cadena = entrada.nextLine();

            if (cadena.equals("&&&&&")) {
                break;
            }
            if ((cadena.length() == 5) && (cadena.charAt(0) == 'X') && (cadena.charAt(4) == 'O')) {
                correcta++;

            } else {
                incorrecta++;
            }

        } while (true);
       

        System.out.println("Informe:");
        System.out.println("Cantidad de Correctas: " +correcta);
        System.out.println("Cantidad de Incorrectas :" +incorrecta);
    }

}
