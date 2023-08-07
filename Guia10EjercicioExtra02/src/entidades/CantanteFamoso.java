/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.

 */
package entidades;


public class CantanteFamoso {
    
    private String cantante;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String discoConMasVentas) {
        this.cantante = cantante;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
    
    
    
}
