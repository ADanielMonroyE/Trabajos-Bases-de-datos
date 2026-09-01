package Tarea1;

import java.util.Arrays;

public class Registro {
    private String redSocial;
    private String concepto;
    private int año;
    private double[] valores; // enero a diciembre

    public Registro() {
    }

    public Registro(String redSocial, String concepto, int año, double[] valores) {
        this.redSocial = redSocial;
        this.concepto = concepto;
        this.año = año;
        this.valores = valores;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double[] getValores() { return valores; }

    public void setValores(double[] valores) {
        this.valores = valores;
    }

    public int getValorMes(int mes) {
        return (int) valores[mes - 1]; // mes: 1=enero, 6=junio...
    }

    @Override
    public String toString() {
        return "Registro{" +
                "redSocial='" + redSocial + '\'' +
                ", concepto='" + concepto + '\'' +
                ", año=" + año +
                ", valores=" + Arrays.toString(valores) +
                '}';
    }


}

