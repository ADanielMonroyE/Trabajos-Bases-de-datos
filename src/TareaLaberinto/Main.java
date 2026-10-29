package TareaLaberinto;

public class Main {

    public static void main(String[] args) {

        try {

            Laberinto laberinto =
                    new Laberinto("C:\\Users\\danie\\OneDrive\\Documentos\\entrada.txt");

            System.out.println("LABERINTO ORIGINAL\n");

            laberinto.imprimir();

            SolverLaberinto solver =
                    new SolverLaberinto(laberinto);

            boolean encontrado = solver.resolver(
                    laberinto.getFilaEntrada(),
                    laberinto.getColumnaEntrada()
            );

            if (encontrado) {

                solver.imprimirSolucion();

            } else {

                System.out.println(
                        "\nNo existe camino entre E y S");
            }

        } catch (Exception e) {

            System.out.println(
                    "Error al leer archivo: "
                            + e.getMessage());
        }
    }
}
