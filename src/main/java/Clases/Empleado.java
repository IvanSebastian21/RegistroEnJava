package Clases;

public class Empleado extends Persona{
    //Propiedades
    private String tipoDeContrato;
    private double sueldo;

    //Metodo
    public void calcularSueldo(Double sueldoBase){
        if (this.getTipoDeContrato() == "A") {
            this.setSueldo(sueldoBase + 10000);
        } else {
            this.setSueldo(sueldoBase + 20000);
        }
    }
    
    // Metodo set y get
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
