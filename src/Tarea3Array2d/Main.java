package Tarea3Array2d;

public class Main {
    public static void main(String[] args) {

        Array2D tablero = CSVReader.leerCSV("C:\\Users\\danie\\IdeaProjects\\Trabajos\\src\\Tarea3Array2d\\poblacion.csv");

        System.out.println("Generación inicial:");
        JuegoDeLaVida.imprimir(tablero);

        for (int gen = 1; gen <= 10; gen++) {
            tablero = JuegoDeLaVida.siguienteGeneracion(tablero);
            System.out.println("Generación " + gen + ":");
            JuegoDeLaVida.imprimir(tablero);
        }
    }
}
