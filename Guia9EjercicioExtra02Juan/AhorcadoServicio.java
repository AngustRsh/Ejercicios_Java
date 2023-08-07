/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author arce
 */
public class AhorcadoServicio {
    private Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        Ahorcado horca=new Ahorcado();
        
        System.out.println("Crear Juego");
        System.out.println("Ingrese la palabra que se debera buscar.");
        String palabra=leer.next();
        horca.setLongitud(palabra.length());
        String[] estudiantes=new String[palabra.length()];
            for(int i=0;i<palabra.length();i++){
            
            estudiantes[i]=palabra.substring(i, i+1);
            }
        horca.setVectorPalabra(estudiantes);
        System.out.println(Arrays.toString(horca.getVectorPalabra()));
        System.out.println("Ingrese la cantidad de jugadas máximas.");
        horca.setJugadasMax(leer.nextInt());
        String[] vectorAux2=new String[horca.getLongitud()];
        for(int i=0;i<horca.getLongitud();i++){
            vectorAux2[i]=" ";
        }
        horca.setVectoraux(vectorAux2);
        return horca;
    }
    
    public void longitud(Ahorcado horca){
        System.out.println("La longitud de la palabra a encontra es: "+horca.getLongitud());
    }
    
    public void buscar(Ahorcado horca){
        
       
        
        
        boolean bucle;
        String Letra;
        int repetir;
        System.out.println("Ingrese una letra.");
        do{
            Letra = leer.next();
            repetir=0;
            for (int i = 0; i < horca.getLongitud(); i++) {
                if (horca.getVectoraux()[i].equalsIgnoreCase(Letra)) {
                    System.out.println("Esta letra ya fue ingresada, ingrese una nueva.");
                    repetir++;
                    break;
                }
            }
            bucle = repetir>0;
            
        } while (bucle == true);
        
        int cont=0;
        
        for(int i=0; i<horca.getLongitud();i++){
            
            
            //condicion = horca.getVectorPalabra()[i].equals(Letra);
            
            
            if(horca.getVectorPalabra()[i].equals(Letra)){
                cont++;
                horca.getVectoraux()[i]=horca.getVectorPalabra()[i];
            }
        }
        if(cont>0){
            System.out.println("La letra pertenece a la palabra");
        }else  {
            System.out.println("La letra no pertenece a la palabra");
            horca.setJugadasMax(horca.getJugadasMax()-1);
        }
        horca.setCantLetras(horca.getCantLetras()+cont);
        
        System.out.println(Arrays.toString(horca.getVectoraux()));
        
    }
    
    public void encontradas(Ahorcado horca){
        
        System.out.println("La cantidad de letras encontradas es: "+horca.getCantLetras());
        int letras=horca.getLongitud()-horca.getCantLetras();
        System.out.println("La cantidad de letras que faltan por encontrar son: "+letras);
    }
    
    public void intentos(Ahorcado horca){
        System.out.println("La cantidad de intentos que le quedan son: "+horca.getJugadasMax());
    }
    
    public void juego(Ahorcado horca){
        do{
            this.buscar(horca);
            System.out.println("Longitud de la palabra: "+horca.getLongitud());
            int letras2=horca.getLongitud()-horca.getCantLetras();
            System.out.println("Número de letras (encontradas, faltantes): ("+horca.getCantLetras()+","+letras2+")");
            System.out.println("Número de oprtunidades restantes: "+horca.getJugadasMax());
        }while(horca.getJugadasMax()>0 && horca.getCantLetras()!=horca.getLongitud());
        if(horca.getJugadasMax()==0){
            System.out.println("Se te acabaron los intentos :(");
            
        }else if(horca.getCantLetras()==horca.getLongitud()){
            System.out.println("¡¡¡Descubriste la palabra, felicidades!!!");
        }
        System.out.println("---FIN DEL JUEGO---");
    }
}
