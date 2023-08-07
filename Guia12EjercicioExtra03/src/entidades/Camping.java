/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package entidades;


public class Camping extends Alojamientos{
    
    private int cantMaximaCarpas;
    private int cantBaniosDisponibles;
    private boolean restauranteDentro;

    public Camping() {
    }

    public Camping(int cantMaximaCarpas, int cantBaniosDisponibles, boolean restauranteDentro) {
        this.cantMaximaCarpas = cantMaximaCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.restauranteDentro = restauranteDentro;
    }

    public Camping(int cantMaximaCarpas, int cantBaniosDisponibles, boolean restauranteDentro, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.cantMaximaCarpas = cantMaximaCarpas;
        this.cantBaniosDisponibles = cantBaniosDisponibles;
        this.restauranteDentro = restauranteDentro;
    }

    public boolean isTieneRestaurante(){
        return restauranteDentro;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                ", Capacidad Máxima de Carpas: " + cantMaximaCarpas +
                ", Cantidad de Baños: " + cantBaniosDisponibles +
                ", Tiene Restaurante: " + (restauranteDentro ? "Sí" : "No");
    }
    
}
