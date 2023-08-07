/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
 */
package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private int dniCliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int dniCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularAlquiler() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);   // devuelve la cantidad de dias que hay entre una fecha y otra
        double moduloBarco = barco.calcularModulo();

        return diasOcupacion * moduloBarco;
    }
}
