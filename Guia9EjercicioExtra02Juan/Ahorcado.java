/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author arce
 */
public class Ahorcado {
    private String[] vectorPalabra;
    private int cantLetras;
    private int jugadasMax;
    private int longitud;
    private String[] vectoraux;
    
    public Ahorcado() {
        
    }

    public Ahorcado(int cantLetras, int jugadasMax, int longitud) {
        this.cantLetras = cantLetras;
        this.jugadasMax = jugadasMax;
        this.longitud = longitud;
        vectorPalabra=new String[longitud];
        vectoraux=new String[longitud];
        
    }

    

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String[] getVectoraux() {
        return vectoraux;
    }

    public void setVectoraux(String[] vectoraux) {
        this.vectoraux = vectoraux;
    }
    
    
    
    
    
}
