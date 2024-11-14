package Programas;

public class Empleado {
// Atributos
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    // Método para calcular ahorro mensual
    public double getAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }
    public double getAhorroSemestral() {
        return (getAhorroMensual()*6);
    }
    public double getAhorroAnual() {
        return (getAhorroMensual()*12);
    }
}
