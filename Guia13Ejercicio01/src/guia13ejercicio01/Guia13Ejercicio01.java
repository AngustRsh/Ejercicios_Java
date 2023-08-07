/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package guia13ejercicio01;

import entidad.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

public class Guia13Ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio pservicio = new PersonaServicio();
//        System.out.println("Ingrese la cantidad de personas que va a ingresar: ");
//        int npersonas = leer.nextInt();
//        Persona[] personas = new Persona[npersonas];   //tipo de vector y cantidad de elementos
//
//        int[] IMC = new int[npersonas];
//        boolean[] mayorEdad = new boolean[npersonas];
//
//        double sobrePeso = 0;
//        double pesoIdeal = 0;
//        double bajoPeso = 0;
//        double esMayor = 0;
//        double esMenor = 0;
//
//        for (int i = 0; i < npersonas; i++) {
//
////            personas[i] = pservicio.crearPersona();
            Persona perso1 = null;

            try {
            pservicio.esMayorDeEdad(perso1);
        } catch (NullPointerException e) {
                System.out.println("Error al cargar datos..");
        }
           
//            
//            
//            IMC[i] = pservicio.calcularIMC(personas[i]);
//
//            switch (IMC[i]) {
//                case 1:
//                    System.out.println("La persona tiene sobre peso.");
//                    sobrePeso++;
//                    break;
//                case 0:
//                    System.out.println("La persona tiene un peso ideal.");
//                    pesoIdeal++;
//                    break;
//                default:
//                    System.out.println("La persona tiene bajo peso");
//                    bajoPeso++;
//                    break;
//            }
//            mayorEdad[i] = pservicio.esMayorDeEdad(personas[i]);
//            if (mayorEdad[i]) {
//                esMayor++;
//            } else {
//                esMenor++;
//            }
//        }
//
//        System.out.println("El promedio de personas con sobre peso: " + ((sobrePeso / npersonas) * 100));
//        System.out.println("El promedio de personas con peso ideal: " + ((pesoIdeal / npersonas) * 100));
//        System.out.println("El promedio de personas con bajo peso: " + ((bajoPeso / npersonas) * 100));
//        System.out.println(esMayor + " son los mayores de edad.");
//        System.out.println(esMenor + " son los menores de edad.");
    }
    
}
