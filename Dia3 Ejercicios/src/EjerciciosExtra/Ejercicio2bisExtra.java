/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;


public class Ejercicio2bisExtra {

    
    public static void main(String[] args) {
        int A,B,C,D, variableAuxiliar;
        
        A = (int)Math.floor(Math.random()*10);
        
        // Generamos un nÃºmero aleatorio para B
        do {
            B = (int)Math.floor(Math.random()*10);
 
        } while (A == B);
        
        // Generamos un nÃºmero aleatorio para C
        do {          
            C = (int)Math.floor(Math.random()*10);
        
        } while (A == C && B == C);
        
        // Generamos un nÃºmero aleatorio para D
        do {          
            D = (int)Math.floor(Math.random()*10);

        } while (A == D && B == D && C == D);
        
        System.out.println("Valores iniciales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
        
        variableAuxiliar = B;
        B = C;
        C = A;
        A = D;
        D = variableAuxiliar;
        
        System.out.println("Valores Finales:\n" + "A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
    }
}