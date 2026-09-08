package Tarea3Array2d;

public class JuegoDeLaVida {

    public static Array2D siguienteGeneracion(Array2D actual) {
        Array2D nueva = new Array2D(actual.getNumRows(), actual.getNumCols());

        for (int r = 0; r < actual.getNumRows(); r++) {
            for (int c = 0; c < actual.getNumCols(); c++) {
                int vecinos = contarVecinos(actual, r, c);
                int estado = actual.get(r, c);

                if (estado == 1) {
                    if (vecinos == 2 || vecinos == 3) nueva.set(r, c, 1);
                    else nueva.set(r, c, 0);
                } else {
                    if (vecinos == 3) nueva.set(r, c, 1);
                    else nueva.set(r, c, 0);
                }
            }
        }
        return nueva;
    }

    private static int contarVecinos(Array2D tablero, int r, int c) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!(i == 0 && j == 0)) {
                    int nr = r + i, nc = c + j;
                    if (nr >= 0 && nr < tablero.getNumRows() &&
                            nc >= 0 && nc < tablero.getNumCols()) {
                        count += tablero.get(nr, nc);
                    }
                }
            }
        }
        return count;
    }

    public static void imprimir(Array2D tablero) {
        for (int r = 0; r < tablero.getNumRows(); r++) {
            for (int c = 0; c < tablero.getNumCols(); c++) {
                System.out.print(tablero.get(r, c) == 1 ? "⬛" : "⬜");
            }
            System.out.println();
        }
        System.out.println();
    }
}
