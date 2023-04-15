/*
Los profesores del curso de programación de Egg necesitan llevar un 
registro de las notas adquiridas por sus 10 alumnos para luego obtener 
una cantidad de aprobados y desaprobados. Durante el período de cursado 
cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por 
parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

 */
package EjerciciosExtras;


public class Extra4 {

   
public static void main(String[] args) {
        int[][] matriz = new int[10][6]; //i es 10, cantidad de lineas
        String[] nombres = new String[10]; 
        String[] notas = new String[7]; 
        relleno(matriz, nombres,notas);
        
        
        
        notas[0] = "Nombres ";
        notas[1] = "1er tp  ";
        notas[2] = "2do tp  ";
        notas[3] = "1er int ";
        notas[4] = "2do int ";
        notas[5] = "Promedio";
        notas[6] = "Aprobo? ";
        
        
    }

    public static void relleno(int[][] matriz, String[] nombres,String[] notas) {
        
        
        for (int i = 0; i <matriz.length; i++) {
            
            System.out.println("Ingrese el nombre del alumno Nro; "+ (i+1));
            nombres[i]= leer.nextLine();
            
            for (int j = 1; j < matriz[i].length-1; j++) {
                
                matriz[i][j] = leer.nextInt();
                
            }
        }
        
        for (int i = 0; i < 7; i++) {
            System.out.println(notas[i]);
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
    }
}