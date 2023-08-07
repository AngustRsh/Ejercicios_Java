/*
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package entidades;

import enums.Cobertura;
import enums.FormaPago;
import java.time.LocalDate;
import java.util.ArrayList;

public class Poliza {
    
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numPoliza;
    private LocalDate fechaInicio;
    private LocalDate finPoliza;
    private ArrayList<Cuota> cantidadCuotas;
    private FormaPago formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoMaxGranizo;
    private Cobertura tipoCobertura;

    public Poliza() {
    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, int numPoliza, LocalDate fechaInicio, LocalDate finPoliza, ArrayList<Cuota> cantidadCuotas, FormaPago formaPago, double montoAsegurado, boolean granizo, double montoMaxGranizo, Cobertura tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.finPoliza = finPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFinPoliza() {
        return finPoliza;
    }

    public void setFinPoliza(LocalDate finPoliza) {
        this.finPoliza = finPoliza;
    }

    public ArrayList<Cuota> getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(ArrayList<Cuota> cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Cobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Cobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    
    
    
    
}
