package Tarea3Array2d;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

    public static Array2D leerCSV(String archivo) {
        Array2D tablero = new Array2D(10, 10);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int fila = 0;
            while ((linea = br.readLine()) != null && fila < 10) {
                String[] partes = linea.split(",");
                for (int col = 0; col < partes.length && col < 10; col++) {
                    tablero.set(fila, col, Integer.parseInt(partes[col].trim()));
                }
                fila++;
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return tablero;
    }
}
