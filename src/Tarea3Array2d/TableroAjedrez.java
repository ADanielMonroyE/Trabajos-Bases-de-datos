package Tarea3Array2d;

public class TableroAjedrez {

    public static Array2DTablero inicializarTablero() {

        Array2DTablero tablero = new Array2DTablero(8, 8);

        // Piezas negras
        String[] fila8 = {
                "\u265C", "\u265E", "\u265D", "\u265B",
                "\u265A", "\u265D", "\u265E", "\u265C"
        };

        String[] fila7 = {
                "\u265F", "\u265F", "\u265F", "\u265F",
                "\u265F", "\u265F", "\u265F", "\u265F"
        };

        // Piezas blancas
        String[] fila2 = {
                "\u2659", "\u2659", "\u2659", "\u2659",
                "\u2659", "\u2659", "\u2659", "\u2659"
        };

        String[] fila1 = {
                "\u2656", "\u2658", "\u2657", "\u2655",
                "\u2654", "\u2657", "\u2658", "\u2656"
        };

        // Colocar piezas negras
        for (int c = 0; c < 8; c++) {
            tablero.set(0, c, fila8[c]);
            tablero.set(1, c, fila7[c]);
        }

        // Casillas vacías
        for (int r = 2; r <= 5; r++) {
            for (int c = 0; c < 8; c++) {
                tablero.set(r, c, " ");
            }
        }

        // Colocar piezas blancas
        for (int c = 0; c < 8; c++) {
            tablero.set(6, c, fila2[c]);
            tablero.set(7, c, fila1[c]);
        }

        return tablero;
    }

    public static void imprimir(Array2DTablero tablero) {

        for (int r = 0; r < tablero.getNumRows(); r++) {

            for (int c = 0; c < tablero.getNumCols(); c++) {
                System.out.print(tablero.get(r, c) + " ");
            }

            System.out.println();
        }
    }
}