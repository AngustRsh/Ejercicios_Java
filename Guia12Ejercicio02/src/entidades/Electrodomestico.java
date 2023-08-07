/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
 */
package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnerg;
    protected double peso;

    //constructores
    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public double getPeso() {
        return peso;
    }

    //getters and setters
    public void setPeso(double peso) {
        this.peso = peso;
    }

//    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public char comprobarConsumoEnergetico(char letra) {
        if (letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E') {
            return 'F';
        }
        return letra;
    }
//    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.

    public String comprobarColor(String color) {
        String colorComprobar = color.toLowerCase();

        switch (colorComprobar) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":

                return colorComprobar;
            default:
                return "blanco";
        }
    }

//    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        this.precio = 1000;

        System.out.println("Ingrese color del Electrodomestico:");
        String color = leer.next();
        setColor(color);

        System.out.println("Ingrese consumo Energetico:");
        char consum = leer.next().charAt(0);
        setConsumoEnerg(consum);

        System.out.println("Ingrese peso del Electrodomestico:");
        double pes = leer.nextDouble();
        setPeso(pes);

    }

//    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
//
//
//LETRA PRECIO
//A $1000
//B $800
//C $600
//D $500
//E $300
//F $100
//
//PESO PRECIO
//Entre 1 y 19 kg $100
//Entre 20 y 49 kg $500
//Entre 50 y 79 kg $800
//Mayor que 80 kg $1000
    public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consumoEnerg) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }

}
