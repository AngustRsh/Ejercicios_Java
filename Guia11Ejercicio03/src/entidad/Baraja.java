/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;

public class Baraja {
    
    ArrayList <Carta> mazoCartas = new ArrayList();
    ArrayList <Carta> monton = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getMazoCartas() {
        return mazoCartas;
    }

    public void setMazoCartas(ArrayList<Carta> mazoCartas) {
        this.mazoCartas = mazoCartas;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "Baraja{" + "mazoCartas=" + mazoCartas + ", monton=" + monton + '}';
    }
}
