/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package guia12ejercicioextra01;

import entidad.Alquiler;
import entidad.Barco;
import entidad.BarcoMotor;
import entidad.Velero;
import entidad.Yate;
import java.time.LocalDate;
import java.time.Month;

public class Guia12EjercicioExtra01 {

    public static void main(String[] args) {

        LocalDate fechaAlquiler = LocalDate.of(2023, Month.FEBRUARY, 11);
        LocalDate fechaDevolucion = LocalDate.of(2023, Month.FEBRUARY, 20);

        Barco velero = new Velero(2, "AOG132", 10, 1995);
        Alquiler alquilerVelero = new Alquiler("Nahuel", 123456, fechaAlquiler, fechaDevolucion, 1, velero);
        double precioAlquilerVelero = alquilerVelero.calcularAlquiler();
        System.out.println("El precio para alquilar el velero es de : " + precioAlquilerVelero);

        Barco barcoAMotor = new BarcoMotor(20, "ALE123", 25, 2002);
        Alquiler alquilerBarcoMotor = new Alquiler("Adriel", 321654, fechaAlquiler, fechaDevolucion, 3, barcoAMotor);
        double precioAlquilerBarcoMotor = alquilerBarcoMotor.calcularAlquiler();
        System.out.println("El precio para alquilar un barco a motor es de : " + precioAlquilerBarcoMotor);

        Barco yate = new Yate(500, 4, "DSO123", 35, 2020);
        Alquiler alquilerYate = new Alquiler("Raul", 1123336699, fechaAlquiler, fechaDevolucion, 8, yate);
        double precioAlquilerYate = alquilerYate.calcularAlquiler();
        System.out.println("El precio por alquilar un yate es de : " + precioAlquilerYate);

    }
}
