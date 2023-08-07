/*
 Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar
 */
package entidades;

public abstract class Alojamientos {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerenteEncargado;

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerenteEncargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Dirección: " + direccion
                + ", Localidad: " + localidad
                + ", Gerente: " + gerenteEncargado;

    }
}
