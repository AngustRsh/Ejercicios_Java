/*
Los Hotel tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package entidades;

public class Hotel extends Alojamientos {

    private int cantHabitaciones;
    private int numDeCamas;
    private int cantiDePisos;
    private double precioHabitaciones;

    public Hotel() {
    }


    public Hotel(int cantHabitaciones, int numDeCamas, int cantiDePisos, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numDeCamas = numDeCamas;
        this.cantiDePisos = cantiDePisos;
        this.precioHabitaciones = calcularPrecioHabitacion();
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumDeCamas() {
        return numDeCamas;
    }

    public void setNumDeCamas(int numDeCamas) {
        this.numDeCamas = numDeCamas;
    }

    public int getCantiDePisos() {
        return cantiDePisos;
    }

    public void setCantiDePisos(int cantiDePisos) {
        this.cantiDePisos = cantiDePisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
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

    private double calcularPrecioHabitacion() {

        double valorAgregadoRestaurante = calcularValorAgregadoRestaurante();
        double valorAgregadoGimnasio = calcularValorAgregadoGimnasio();
        double valorAgregadoLimosinas = calcularValorAgregadoLimosinas();

        return 50 + (1 * cantHabitaciones) + valorAgregadoRestaurante + valorAgregadoGimnasio + valorAgregadoLimosinas;
    }

    public double calcularValorAgregadoRestaurante() {
        int capacidadRestaurante = 0;

        if (capacidadRestaurante < 30) {
            return 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            return 30;
        } else {
            return 50;
        }

    }

    private double calcularValorAgregadoGimnasio(){
        String tipoGimansio = "" ;
        
        if (tipoGimansio.equalsIgnoreCase("A")) {
            return 50;
        }else if (tipoGimansio.equalsIgnoreCase("B")) {
            return 30 ;
        }else{
            return 0 ;
        }

    }
    
     private double calcularValorAgregadoLimosinas(){
            int cantidadLimosinas = 0 ;
            
            return 15 * cantidadLimosinas ;
        }
    
     @Override
    public String toString() {
        return super.toString() +
                ", Cantidad de Habitaciones: " + cantHabitaciones +
                ", Número de Camas: " + numDeCamas +
                ", Cantidad de Pisos: " + cantiDePisos +
                ", Precio de Habitaciones: " + precioHabitaciones;
    }
     
   
    public int compareTo(Hotel otroHotel) {
        return Double.compare(otroHotel.getPrecioHabitaciones(), this.precioHabitaciones);
    }
    
    
}


