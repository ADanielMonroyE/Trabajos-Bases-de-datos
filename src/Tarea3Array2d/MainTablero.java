package Tarea3Array2d;

public class MainTablero {
    public static void main(String[] args) {


        String[][] piezas = new String[8][9];

        piezas[0][0]="8";
        piezas[0][1]="♖";
        piezas[0][2]="♘";
        piezas[0][3]="♗";
        piezas[0][4]="♕";
        piezas[0][5]="♔";
        piezas[0][6]="♗";
        piezas[0][7]="♘";
        piezas[0][8]="♖";

        piezas[1][0]="7";
        piezas[1][1]="♙";
        piezas[1][2]="♙";
        piezas[1][3]="♙";
        piezas[1][4]="♙";
        piezas[1][5]="♙";
        piezas[1][6]="♙";
        piezas[1][7]="♙";
        piezas[1][8]="♙";

        piezas[2][0]="6";
        piezas[2][1]=" ";
        piezas[2][2]=" ";
        piezas[2][3]=" ";
        piezas[2][4]=" ";
        piezas[2][5]=" ";
        piezas[2][6]=" ";
        piezas[2][7]=" ";
        piezas[2][8]=" ";

        piezas[3][0]="5";
        piezas[3][1]=" ";
        piezas[3][2]=" ";
        piezas[3][3]=" ";
        piezas[3][4]=" ";
        piezas[3][5]=" ";
        piezas[3][6]=" ";
        piezas[3][7]=" ";
        piezas[3][8]=" ";

        piezas[4][0]="4";
        piezas[4][1]=" ";
        piezas[4][2]=" ";
        piezas[4][3]=" ";
        piezas[4][4]=" ";
        piezas[4][5]=" ";
        piezas[4][6]=" ";
        piezas[4][7]=" ";
        piezas[4][8]=" ";

        piezas[5][0]="3";
        piezas[5][1]=" ";
        piezas[5][2]=" ";
        piezas[5][3]=" ";
        piezas[5][4]=" ";
        piezas[5][5]=" ";
        piezas[5][6]=" ";
        piezas[5][7]=" ";
        piezas[5][8]=" ";

        piezas[6][0]="2";
        piezas[6][1]="♟";
        piezas[6][2]="♟";
        piezas[6][3]="♟";
        piezas[6][4]="♟";
        piezas[6][5]="♟";
        piezas[6][6]="♟";
        piezas[6][7]="♟";
        piezas[6][8]="♟";

        piezas[7][0]="1";
        piezas[7][1]="♜";
        piezas[7][2]="♞";
        piezas[7][3]="♝";
        piezas[7][4]="♛";
        piezas[7][5]="♚";
        piezas[7][6]="♝";
        piezas[7][7]="♞";
        piezas[7][8]="♜";


        for(int i = 0;i<piezas.length;i++){
            System.out.println();
            for (int j = 0; j < piezas[i].length; j++) {
                System.out.print(piezas[i][j] + " ");
            }
        }
    }

}
