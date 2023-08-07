/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Direccion {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;

    private String pais;
    private String provincia;

    public Direccion(String id, String pais, String provincia) {
        this.id = id;
        this.pais = pais;
        this.provincia = provincia;
    }

    public Direccion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", pais=" + pais + ", provincia=" + provincia + '}';
    }

}