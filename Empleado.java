package Tarea2Nomina;

public class Empleado {
    private int numeroTrabajador;
    private String nombres;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int numeroTrabajador, String nombres, String paterno, String materno,
                    int horasExtra, double sueldoBase, int anioIngreso) {
        this.numeroTrabajador = numeroTrabajador;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return numeroTrabajador + " - " + nombres + " " + paterno + " " + materno +
                " | Horas extra: " + horasExtra +
                " | Sueldo base: " + sueldoBase +
                " | Año ingreso: " + anioIngreso;
    }

    public double calcularSueldo(int anioActual) {
        double pagoHorasExtra = horasExtra * 276.5;
        int antiguedad = anioActual - anioIngreso;
        double prestacion = sueldoBase * 0.03 * antiguedad;
        return sueldoBase + pagoHorasExtra + prestacion;
    }
}

