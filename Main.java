package Tarea2Nomina;

public class Main {
    public static void main(String[] args) {
        NominaICO nomina = new NominaICO();
        nomina.leerArchivo("C:\\Users\\danie\\IdeaProjects\\Trabajos\\src\\Tarea2Nomina\\junio.dat");

        System.out.println("Empleado con mayor antigüedad:");
        System.out.println(nomina.obtenerMayorAntiguedad());

        System.out.println("\nEmpleado con menor antigüedad:");
        System.out.println(nomina.obtenerMenorAntiguedad());

        System.out.println("\nSueldos de todos los empleados:");
        nomina.imprimirSueldos();
    }
}
