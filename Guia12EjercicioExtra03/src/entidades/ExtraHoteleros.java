/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package entidades;


public class ExtraHoteleros extends Alojamientos {
    
    private boolean privado;
    private double cantMetrosCuadrados;

    public ExtraHoteleros() {
    }

    public ExtraHoteleros(boolean privado, double cantMetrosCuadrados) {
        this.privado = privado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public ExtraHoteleros(boolean privado, double cantMetrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.privado = privado;
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantMetrosCuadrados() {
        return cantMetrosCuadrados;
    }

    public void setCantMetrosCuadrados(double cantMetrosCuadrados) {
        this.cantMetrosCuadrados = cantMetrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }
    
    
    
}
