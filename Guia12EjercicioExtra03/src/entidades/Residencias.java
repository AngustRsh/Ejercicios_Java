/*
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package entidades;


public class Residencias extends Alojamientos{
    
     private int cantidadHabitaciones;
    private boolean haceDescuentos;
    private boolean tieneCampoDeportivo;

    public Residencias(int cantidadHabitaciones, boolean haceDescuentos, boolean tieneCampoDeportivo) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.haceDescuentos = haceDescuentos;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public Residencias(int cantidadHabitaciones, boolean haceDescuentos, boolean tieneCampoDeportivo, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.haceDescuentos = haceDescuentos;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }



    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean isHaceDescuentos() {
        return haceDescuentos;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cantidad de Habitaciones: " + cantidadHabitaciones +
                ", Hace Descuentos: " + (haceDescuentos ? "Sí" : "No") +
                ", Tiene Campo Deportivo: " + (tieneCampoDeportivo ? "Sí" : "No");
    }
}
