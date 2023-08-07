
package entidad;


public class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    public double calcularArea(){
        
        return pi * Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(){
        
        return 2 * pi * radio;
    }
    
}
