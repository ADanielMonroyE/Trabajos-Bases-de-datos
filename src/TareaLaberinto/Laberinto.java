package TareaLaberinto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Laberinto {

    private char[][] tablero;

    private int filaEntrada;
    private int columnaEntrada;

    private int filaSalida;
    private int columnaSalida;

    public Laberinto(String archivo) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(archivo));

        int filas = Integer.parseInt(sc.nextLine().trim());
        int columnas = Integer.parseInt(sc.nextLine().trim());

        tablero = new char[filas][columnas];

        for (int i = 0; i < filas; i++) {

            String linea = sc.nextLine();
            String[] datos = linea.split(",");

            for (int j = 0; j < columnas; j++) {

                tablero[i][j] = datos[j].charAt(0);

                if (tablero[i][j] == 'E') {
                    filaEntrada = i;
                    columnaEntrada = j;
                }

                if (tablero[i][j] == 'S') {
                    filaSalida = i;
                    columnaSalida = j;
                }
            }
        }

        sc.close();
    }

    public char[][] getTablero() {
        return tablero;
    }

    public int getFilaEntrada() {
        return filaEntrada;
    }

    public int getColumnaEntrada() {
        return columnaEntrada;
    }

    public int getFilaSalida() {
        return filaSalida;
    }

    public int getColumnaSalida() {
        return columnaSalida;
    }

    public void imprimir() {

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[0].length; j++) {

                System.out.print(tablero[i][j] + " ");
            }

            System.out.println();
        }
    }
}