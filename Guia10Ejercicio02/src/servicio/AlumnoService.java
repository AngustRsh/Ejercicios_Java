/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 */
package servicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    public ArrayList<Alumno> crearListaAlumnos() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;

        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese nombre del Alumno:");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese nota del Alumno:");
            ArrayList<Integer> notas = new ArrayList();

            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro Alumno? (S/N)");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;
            }
        } while (confirmacion);

        return alumnos;
    }

    public double buscarAlumno(ArrayList<Alumno> alumnos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del Estudiante a calcular la Nota Final:");
        String alumnoABuscar = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno alumnoAuxiliar = it.next();
            if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)) {
                return promedioNotas(alumnoAuxiliar);
            }

        }
        System.out.println("No se encontro el estudiante");
        return 0;
    }

    public double promedioNotas(Alumno alumno) {
        double sumaNotas = 0;
        for (Integer nota : alumno.getNotas()) {
            sumaNotas += nota;
        }
        return sumaNotas / alumno.getNotas().size();
    }

}
