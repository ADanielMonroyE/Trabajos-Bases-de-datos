package Tarea1;

import java.util.List;

public class Analizador {
    private List<Registro> registros;

    public Analizador(List<Registro> registros) {
        this.registros = registros;
    }

    public int diferenciaSeguidoresTwitter(int mes1, int mes2) {
        for (Registro r : registros) {
            if (r.getRedSocial().equalsIgnoreCase("TWITTER") &&
                    r.getConcepto().toUpperCase().contains("SEGUIDORES")) {
                return r.getValorMes(mes2) - r.getValorMes(mes1);
            }
        }
        return 0;
    }

    public int diferenciaVisualizacionesYouTube(int mes1, int mes2) {
        for (Registro r : registros) {
            if (r.getRedSocial().equalsIgnoreCase("YOUTUBE") &&
                    r.getConcepto().equalsIgnoreCase("VISUALIZACIONES")) {
                return r.getValorMes(mes2) - r.getValorMes(mes1);
            }
        }
        return 0;
    }

    public double promedioCrecimiento(String redSocial) {
        for (Registro r : registros) {
            if (r.getRedSocial().equalsIgnoreCase(redSocial) &&
                    r.getConcepto().toUpperCase().contains("CRECIMIENTO")) {
                int suma = 0;
                for (int i = 0; i < 6; i++) suma += r.getValores()[i];
                return (double) suma / 6;
            }
        }
        return 0;
    }

    public double promedioLikes(String redSocial) {
        for (Registro r : registros) {
            if (r.getRedSocial().equalsIgnoreCase(redSocial) &&
                    r.getConcepto().toUpperCase().contains("ME GUSTA")) {
                int suma = 0;
                for (int i = 0; i < 6; i++) suma += r.getValores()[i];
                return (double) suma / 6;
            }
        }
        return 0;
    }
}


