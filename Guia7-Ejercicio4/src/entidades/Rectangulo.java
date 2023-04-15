/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará
el rectángulo mediante asteriscos usando la base y la altura. Se deberán además 
definir los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package entidades;

import java.util.Scanner;


public class Rectangulo {
    
    private double base;
    private double altura;
    
    //Metodos Constructores
    
    public Rectangulo() {
    }
       
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodo Set
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo Get
    
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //Metodo creacion del rectangulo
    
    public void creacionRectangulo(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar base y altura del rectangulo: ");
        this.base = leer.nextDouble();
        this.altura = leer.nextDouble();
        
    }
    
    //Metodo superficie del rectangulo
    
    public void superficieRectangulo(){
        
        System.out.println("La superficie del rectangulo es de: " +(this.base*this.altura));
    }
    
    //Metodo perimetro del rectangulo
    public void perimetroRectangulo(){
        
        System.out.println("El perimetro del rectangulo es de: " +((this.base+this.altura)*2));
    }
    
    //Metodo que dibujará el rectangulo

    public void dibujarRectangulo() {

        for (int x = 0; x < this.base; x++) { //para x que comienza en 0 hasta punto con paso +1
            for (int y = 0; y < this.altura; y++) { //para y que comienza en 0 hasta punto con paso +1
                if (x == 0 || x == this.base - 1 || y == 0 || y == this.altura - 1) { //marcara un asterisco siempre en cuanto estemos en los bordes del cuadrado
                    /*
                    *Son dos for anidados que hacen el barrido como el que usabamos en matrices:
                    *teniendo el valor de la cantidad de asteriscos (en este caso es la varible punto)
                    *tenemos el limite y lo que van a hacer los for pasar y si se cumple algunas de las condiciones
                    *del if en la linea 31, escribira un asterisco, caso contrario no. 
                     */
                    System.out.print("*"); // no se usa System.out.println() por que da salto de linea
                } else {
                    System.out.print(" "); //solo usamos System.out.print()
                }
            }
            System.out.println(); // Aca le metemos este sout, para que haga el salto de linea una vez recorrido cada renglon edl cuadrado. 
        }
    }
}
    
    
    


