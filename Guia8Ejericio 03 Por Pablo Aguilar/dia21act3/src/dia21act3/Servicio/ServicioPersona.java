package dia21act3.Servicio;

import dia21act3.Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    Persona p = new Persona();
    
    public boolean Mayor(Persona p){
        boolean t;
        if(p.getEdad()>18){
        t = true;
        }else{
        t = false;
        }
        return t;
    }
    
    public Persona Crear_persona(){
        System.out.println("Introducir Genero");
        p.setSex(leer.next());
        if(p.getSex().equalsIgnoreCase("H")||p.getSex().equalsIgnoreCase("M")||p.getSex().equalsIgnoreCase("O")){
        }else{
            System.out.println("Genero Incorrecto");
        }
        System.out.println("Introducir edad");
        p.setEdad(leer.nextInt());
        System.out.println("Introducir Nombre");
        p.setNombre(leer.next());
        System.out.println("Introducir altura");
        p.setAltura(leer.nextDouble());
        System.out.println("Introducir peso");
        p.setPeso(leer.nextDouble());
        System.out.println("");
        return p;
    }
    
    public int calcular_IMC(Persona p){
        int i = 0;
        double r = p.getPeso()/Math.pow(p.getAltura(),2);
        if(r < 20){ 
            i = 1;
        }else if(r > 20 && r < 25){
             i = 2;
        }else if(r > 25){
            i = 3;
        }
        return i;
    }
    
}
