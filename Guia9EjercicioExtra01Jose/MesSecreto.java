/*
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
 * A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, 
 * y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 */
package Servicio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MesSecreto {
    
  Random rand = new Random();
    Scanner leer = new Scanner(System.in);
    String[] mesesSecreto = new String[12];
    String mesSecreto;   
    
    
 public void MesesSecreto() {
        this.mesesSecreto[0] = "enero";
        this.mesesSecreto[1] = "febrero";
        this.mesesSecreto[2] = "marzo";
        this.mesesSecreto[3] = "abril";
        this.mesesSecreto[4] = "mayo";
        this.mesesSecreto[5] = "junio";
        this.mesesSecreto[6] = "julio";
        this.mesesSecreto[7] = "agosto";
        this.mesesSecreto[8] = "septiembre";
        this.mesesSecreto[9] = "octubre";
        this.mesesSecreto[10] = "noviembre";
        this.mesesSecreto[11] = "diciembre";
        mesSecreto = mesesSecreto[rand.nextInt(12)];
        //System.out.println("el mes secreto es : " + mesSecreto);
    }    
 
 public void juegoMesSecreto(){
        boolean acertado = false;
        System.out.println("BIENVENIDO a MES SECRETO");
        System.out.println("Adivine el mes en minuscula ejemplo : enero/octubre/etc");
        do{
            System.out.println("Adivine el mes : ");
            String prediccion = leer.nextLine();
            if (prediccion.equals(mesSecreto)){
                System.out.println("FELICITACIONES ha acertado !");
                acertado = true;
            }else{
                System.out.println("INCORRECTO vuelva a intentarlo");
            } 
        }while (!acertado);   
    }
    
    
}
