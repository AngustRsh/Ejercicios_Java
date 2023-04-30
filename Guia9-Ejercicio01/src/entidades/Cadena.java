/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase
como atributo debe setear la longitud de la frase de manera automática.
 */
package entidades;


public class Cadena {
    
    private String frase;
    private int longitudFrase;

    //constructor vacio
    public Cadena() {
    }

    //constructor de frase
    public Cadena(String frase) {
        this.frase = frase;
//      this.longitudFrase = frase.length();
        
  
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public long getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
}
