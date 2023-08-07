/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidad;


public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo() {
    }

    
    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    
    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public String getNombre(){
        return nombre;
    }
    
}
