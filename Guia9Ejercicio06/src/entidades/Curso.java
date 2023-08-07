/*
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión
5 (cinco), donde se alojarán los nombres de cada alumno.
A continuación, se implementarán los siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en
un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.

 */
package entidades;


public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno; // maniana/tarde
    private double precioPorHora;
    public String[] vectorAlumnos = new String[5];

    //Metodo a)
    public Curso() {
    }

    //Metodo b)
    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    //Metodos c) get and set
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getVectorAlumnos() {
        return vectorAlumnos;
    }

    public void setVectorAlumnos(String[] vectorAlumnos) {
        this.vectorAlumnos = vectorAlumnos;
    }
}
