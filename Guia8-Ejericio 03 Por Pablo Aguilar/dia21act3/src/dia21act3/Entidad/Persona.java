package dia21act3.Entidad;

public class Persona {
    
    private String nombre;
    private int edad;
    private String sex;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sex, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sex = sex;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
