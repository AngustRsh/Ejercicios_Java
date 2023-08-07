/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 
2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
raíz. Es en el caso en que se tenga una única solución posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y 
mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros 
métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) 
Solo varía el signo delante de -b
 */
package Servicio;

import Entidades.Raices;
import java.util.Scanner;

public class RaicesServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo a)
    public Raices getDiscriminante() {

        Raices fc = new Raices();

        System.out.println("Ingrese el valor del coeficiente 'a', distinto de 0 :");
        fc.setA(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente 'b' :");
        fc.setB(leer.nextDouble());
        System.out.println("Ingrese el valor del coeficiente 'c' :");
        fc.setC(leer.nextDouble());

        System.out.println("El dicriminante es: " + ((Math.pow(fc.getB(), 2)) - (4 * fc.getA() * fc.getC())));

        return fc;
    }

    //Metodo b)
    public boolean tieneRaices(Raices fc ) {
        
        return ((Math.pow(fc.getB(), 2)) - (4 * fc.getA() * fc.getC())) > 0;
    }
    
    //Metodo c)
    public boolean tieneRaiz(Raices fc) {
        return ((Math.pow(fc.getB(), 2)) - (4 * fc.getA() * fc.getC())) == 0;
    }

    //Metodo d)
    public void obtenerRaices(Raices fc) {
        if (tieneRaices(fc))  {
            
            double raiz1 = (-fc.getB() + Math.sqrt((Math.pow(fc.getB(), 2))-(4*fc.getA()*fc.getC()))) / (2*fc.getA());
            double raiz2 = (-fc.getB() - Math.sqrt((Math.pow(fc.getB(), 2))-(4*fc.getA()*fc.getC()))) / (2*fc.getA());
            
            System.out.println("La primera solucion es: " +raiz1+ " y la segunda raiz vale: "+raiz2);
        }   
    }
    
    //Metodo e)
    public void obtenerRaiz(Raices fc) {
        if (tieneRaiz(fc)) {
            double raiz = (-fc.getB()) / (2*fc.getA());
            System.out.println("La funcion tiene raiz en: " +raiz);
        }
    }
    
    //Metodo f)
    public void calcular(Raices fc) {
        if (tieneRaiz(fc)) {
            System.out.println("La funcion tiene 1 raiz doble: ");
            obtenerRaiz(fc);
            
        }else if (tieneRaices(fc)) {
            System.out.println("La funcion tiene 2 raices reales distintas:");
            obtenerRaices(fc);
 
        }else   {
            System.out.println("La funcion no  tiene raices reales.");
        }     
    }
}

