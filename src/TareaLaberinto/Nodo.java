package TareaLaberinto;

public class Nodo {

    int fila;
    int columna;

    public Nodo(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "(" + fila + "," + columna + ")";
    }
}
