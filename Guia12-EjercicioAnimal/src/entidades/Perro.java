/*
Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno.
 */
package entidades;


public class Perro extends Animal {
    
    @Override
    
    public String hacerRuido(){
       return "Guauu...";
    }
    
}
