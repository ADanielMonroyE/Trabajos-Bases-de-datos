package Tarea2Nomina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;

public class NominaICO {
    private ArrayADT<Empleado> datos;

    public void leerArchivo(String rutaArchivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int contador = 0;

            // Contados de líneas
            while ((linea = lector.readLine()) != null) {
                contador++;
            }

            // Reinicia el lector
            lector.close();
            BufferedReader lector2 = new BufferedReader(new FileReader(rutaArchivo));

            // Saltar la primera línea (encabezado)
            lector2.readLine();

            datos = new ArrayADT<>(contador - 1); //
            int indice = 0;

            while ((linea = lector2.readLine()) != null) {
                String[] partes = linea.split(",");

                int numeroTrabajador = Integer.parseInt(partes[0].trim());
                String nombres = partes[1].trim();
                String paterno = partes[2].trim();
                String materno = partes[3].trim();
                int horasExtra = Integer.parseInt(partes[4].trim());
                double sueldoBase = Double.parseDouble(partes[5].trim());
                int anioIngreso = Integer.parseInt(partes[6].trim());

                Empleado emp = new Empleado(numeroTrabajador, nombres, paterno, materno,
                        horasExtra, sueldoBase, anioIngreso);

                datos.insertarElemento(indice, emp);
                indice++;
            }

            lector2.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public Empleado obtenerMayorAntiguedad() {
        Empleado mayor = datos.obtenerElemento(0);
        for (int i = 1; i < datos.longitud(); i++) {
            Empleado actual = datos.obtenerElemento(i);
            if (actual.getAnioIngreso() < mayor.getAnioIngreso()) {
                mayor = actual;
            }
        }
        return mayor;
    }

    public Empleado obtenerMenorAntiguedad() {
        Empleado menor = datos.obtenerElemento(0);
        for (int i = 1; i < datos.longitud(); i++) {
            Empleado actual = datos.obtenerElemento(i);
            if (actual.getAnioIngreso() > menor.getAnioIngreso()) {
                menor = actual;
            }
        }
        return menor;
    }

    public void imprimirSueldos() {
        int anioActual = Year.now().getValue();
        for (int i = 0; i < datos.longitud(); i++) {
            Empleado emp = datos.obtenerElemento(i);
            double sueldo = emp.calcularSueldo(anioActual);
            System.out.println(emp.toString() + " | Sueldo total: $" + sueldo);
        }
    }
}

