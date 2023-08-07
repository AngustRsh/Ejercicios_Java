/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Rigenk
 */
public class Ahorcado {
    
    private String[] palabraElegida;
    private int letrasEncontrada;
    private int oportunidades;
    private String[] palabraCompletada;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraElegida, int letrasEncontrada, int oportunidades, String[] palabraCompletada) {
        this.palabraElegida = palabraElegida;
        this.letrasEncontrada = letrasEncontrada;
        this.oportunidades = oportunidades;
        this.palabraCompletada = palabraCompletada;
    }

    public String[] getPalabraElegida() {
        return palabraElegida;
    }

    public void setPalabraElegida(String[] palabraElegida) {
        this.palabraElegida = palabraElegida;
    }

    public int getLetrasEncontrada() {
        return letrasEncontrada;
    }

    public void setLetrasEncontrada(int letrasEncontrada) {
        this.letrasEncontrada = letrasEncontrada;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }

    public String[] getPalabraCompletada() {
        return palabraCompletada;
    }

    public void setPalabraCompletada(String[] palabraCompletada) {
        this.palabraCompletada = palabraCompletada;
    }

   
    
    
}
