/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas 
y la cantidad jugadas máximas que puede realizar el usuario.
 */
package entidades;


public class Ahorcado {
    private String[] palabraBuscar;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }
    
    
    
    
    
}
