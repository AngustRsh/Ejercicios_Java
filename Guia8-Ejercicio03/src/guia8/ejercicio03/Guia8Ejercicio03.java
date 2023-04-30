/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.

 */
package guia8.ejercicio03;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;


public class Guia8Ejercicio03 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       PersonaServicio pservicio = new PersonaServicio();
        System.out.println("Ingrese la cantidad de personas que va a ingresar: ");
        int npersonas = leer.nextInt();
       Persona[] personas = new Persona[npersonas];   //tipo de verctor y cantidad de elementos
       
       int[] IMC = new int[npersonas];
       boolean[] mayorEdad = new boolean[npersonas];
       
       double sobrePeso = 0;
       double pesoIdeal = 0;
       double bajoPeso = 0;
       double esMayor = 0;
       double esMenor = 0;
       
       for (int i = 0; i < npersonas; i++) {
            
            personas[i] = pservicio.crearPersona();
            
            IMC[i] = pservicio.calcularIMC(personas[i]);
            
           switch (IMC[i]) {
               case 1:
                   System.out.println("La persona tiene sobre peso.");
                   sobrePeso++;
                   break;
               case 0:
                   System.out.println("La persona tiene un peso ideal.");
                   pesoIdeal++;
                   break;
               default:
                   System.out.println("La persona tiene bajo peso"); 
                   bajoPeso++;
                   break;
           }
            mayorEdad[i] = pservicio.esMayorDeEdad(personas[i]);
            if (mayorEdad[i]) {
                esMayor++;
           } else   {
                esMenor++;
            }
        }
       
        System.out.println("El promedio de personas con sobre peso: " +((sobrePeso/npersonas)*100));
        System.out.println("El promedio de personas con peso ideal: " +((pesoIdeal/npersonas)*100));
        System.out.println("El promedio de personas con bajo peso: " +((bajoPeso/npersonas)*100));
        System.out.println(esMayor + " son los mayores de edad.");
        System.out.println(esMenor + " son los menores de edad.");
    }
    
}
