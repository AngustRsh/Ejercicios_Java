package dia21act3;

import dia21act3.Entidad.Persona;
import dia21act3.Servicio.ServicioPersona;
import java.util.Scanner;

public class Dia21act3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona sp1 = new ServicioPersona();
        ServicioPersona sp2 = new ServicioPersona();
        ServicioPersona sp3 = new ServicioPersona();
        ServicioPersona sp4 = new ServicioPersona();
        Persona p1 = sp1.Crear_persona();
        Persona p2 = sp2.Crear_persona();
        Persona p3 = sp3.Crear_persona();
        Persona p4 = sp4.Crear_persona();
        
        int i = 0;
        int b = 0;
        int a = 0;
        int c = 0;
        int d = 0;
        
        
        
        if(sp1.Mayor(p1) == true){
            i = i + 1;
        }else{
            d = d + 1;
        }
        
        if(sp1.calcular_IMC(p1) == 1){
            a = a + 1;
        }else if(sp1.calcular_IMC(p1) == 2){
            b = b + 1;
        }else if(sp1.calcular_IMC(p1) == 3){
            c = c + 1;
        }
        
        System.out.println("");/////////////////////////
        
        
        
        if(sp2.Mayor(p2) == true){
            i = i + 1;
        }else{
            d = d + 1;
        }
        
        if(sp2.calcular_IMC(p2) == 1){
            a = a + 1;
        }else if(sp2.calcular_IMC(p2) == 2){
            b = b + 1;
        }else if(sp2.calcular_IMC(p2) == 3){
            c = c + 1;
        }
        
        System.out.println("");////////////////////////////
        
        
        
        if(sp3.Mayor(p3) == true){
            i = i + 1;
        }else{
            d = d + 1;
        }
        
        if(sp3.calcular_IMC(p3) == 1){
            a = a + 1;
        }else if(sp3.calcular_IMC(p3) == 2){
            b = b + 1;
        }else if(sp3.calcular_IMC(p3) == 3){
            c = c + 1;
        }
        
        System.out.println("");/////////////////////////////
        
        
        
        if(sp4.Mayor(p4) == true){
            i = i + 1;
        }else{
            d = d + 1;
        }
        
        if(sp4.calcular_IMC(p4) == 1){
            a = a + 1;
        }else if(sp4.calcular_IMC(p4) == 2){
            b = b + 1;
        }else if(sp4.calcular_IMC(p4) == 3){
            c = c + 1;
        }
        
        System.out.println("");//////////////////////////////
        
        System.out.println("cantidad de personas mayores de edad: "+i);
        System.out.println("cantidad de personas menores de edad: "+d);
        System.out.println("cantidad de personas con bajo peso: "+a);
        System.out.println("cantidad de personas con peso normal: "+b);
        System.out.println("cantidad de personas con sobre peso: "+c);
        System.out.println("");
    }
    
}
