/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidad;


public class EdificioDeOficinas extends Edificio {
    
    private int numOficinas;
    private int cantidadPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantidadPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numPisos = numPisos;
    }


    @Override
    public double calcularSuperficie() {
       return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto * numPisos;
    }
    
    public void cantPersonas(){
        int personaPorPiso = cantidadPersonas * numOficinas;
        int personasEnEdificio = personaPorPiso * numPisos;
        
        System.out.println("Personas por Piso: " +personaPorPiso);
        System.out.println("Personas en todo el edificio: " +personasEnEdificio);
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
