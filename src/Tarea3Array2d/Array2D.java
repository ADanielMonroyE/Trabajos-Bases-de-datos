package Tarea3Array2d;

public class Array2D {
    private int[][] data;

    public Array2D(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int get(int r, int c) {
        return data[r][c];
    }

    public void set(int r, int c, int val) {
        data[r][c] = val;
    }

    public int getNumRows() { return data.length; }
    public int getNumCols() { return data[0].length; }
}
