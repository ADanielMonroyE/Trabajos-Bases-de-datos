package TareaLaberinto;

import java.util.Stack;

public class SolverLaberinto {

    private char[][] tablero;
    private boolean[][] visitado;

    private int filaSalida;
    private int columnaSalida;

    public SolverLaberinto(Laberinto laberinto) {

        tablero = laberinto.getTablero();

        visitado = new boolean
                [tablero.length]
                [tablero[0].length];

        filaSalida = laberinto.getFilaSalida();
        columnaSalida = laberinto.getColumnaSalida();
    }

    public boolean resolver(int filaInicio,
                            int columnaInicio) {

        Stack<Nodo> pila = new Stack<>();

        pila.push(new Nodo(filaInicio, columnaInicio));
        visitado[filaInicio][columnaInicio] = true;

        int[][] movimientos = {
                {-1, 0}, // arriba
                {1, 0},  // abajo
                {0, -1}, // izquierda
                {0, 1}   // derecha
        };

        while (!pila.isEmpty()) {

            Nodo actual = pila.peek();

            if (actual.fila == filaSalida
                    && actual.columna == columnaSalida) {

                System.out.println("\nCAMINO ENCONTRADO:\n");

                for (Nodo n : pila) {

                    System.out.println(n);

                    if (tablero[n.fila][n.columna] == '0') {
                        tablero[n.fila][n.columna] = '*';
                    }
                }

                return true;
            }

            boolean avance = false;

            for (int[] mov : movimientos) {

                int nuevaFila = actual.fila + mov[0];
                int nuevaColumna = actual.columna + mov[1];

                if (esValido(nuevaFila, nuevaColumna)) {

                    pila.push(
                            new Nodo(
                                    nuevaFila,
                                    nuevaColumna));

                    visitado[nuevaFila][nuevaColumna] = true;

                    avance = true;
                    break;
                }
            }

            if (!avance) {
                pila.pop(); // BACKTRACKING
            }
        }

        return false;
    }

    private boolean esValido(int fila,
                             int columna) {

        return fila >= 0
                && fila < tablero.length
                && columna >= 0
                && columna < tablero[0].length
                && !visitado[fila][columna]
                && tablero[fila][columna] != '1';
    }

    public void imprimirSolucion() {

        System.out.println("\nLABERINTO RESUELTO:\n");

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[0].length; j++) {

                System.out.print(tablero[i][j] + " ");
            }

            System.out.println();
        }
    }
}
