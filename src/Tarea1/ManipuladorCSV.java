package Tarea1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorCSV {
    public List<Registro> leerArchivo(String nombreDeArchivo) {
        List<Registro> registros = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreDeArchivo))) {
            String linea = lector.readLine(); // saltar encabezado
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");

                String redSocial = partes[0].trim();
                String concepto = partes[1].trim();
                int año = Integer.parseInt(partes[2].trim());

                double[] valores = new double[12];
                for (int i = 0; i < 12; i++) {
                    String dato = partes[i + 3]
                            .replace("%", "")
                            .replace("\"", "")
                            .replace(",", "")
                            .trim();
                    valores[i] = dato.isEmpty() ? 0 : Double.parseDouble(dato);
                }

                registros.add(new Registro(redSocial, concepto, año, valores));
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return registros;
    }
}
