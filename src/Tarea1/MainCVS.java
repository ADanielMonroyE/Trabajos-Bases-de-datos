package Tarea1;

import java.util.List;
import java.util.Scanner;

public class MainCVS {
    public static void main(String[] args) {
        ManipuladorCSV lector = new ManipuladorCSV();
        List<Registro> registros = lector.leerArchivo("C:\\Users\\danie\\Downloads\\Datos redes.csv"); //Ubicacion del archivo

        Analizador analizador = new Analizador(registros);
        Scanner sc = new Scanner(System.in);

        // Pedir meses al usuario SOLO para YouTube
        System.out.println("Ingrese el número del primer mes para YouTube (1=Enero, 2=Febrero, ... 12=Diciembre): ");
        int mes1 = sc.nextInt();
        System.out.println("Ingrese el número del segundo mes para YouTube: ");
        int mes2 = sc.nextInt();

        // Resultados
        System.out.println("Diferencia seguidores Twitter (Enero-Junio): " +
                analizador.diferenciaSeguidoresTwitter(1, 6));

        System.out.println("Diferencia visualizaciones YouTube (" + mes1 + "-" + mes2 + "): " +
                analizador.diferenciaVisualizacionesYouTube(mes1, mes2));

        System.out.printf("Promedio crecimiento Facebook (Enero-Junio): %.2f%n",
                analizador.promedioCrecimiento("FACEBOOK"));
        System.out.printf("Promedio crecimiento Twitter (Enero-Junio): %.2f%n",
                analizador.promedioCrecimiento("TWITTER"));

        System.out.printf("Promedio likes Facebook (Enero-Junio): %.2f%n",
                analizador.promedioLikes("FACEBOOK"));
        System.out.printf("Promedio likes Twitter (Enero-Junio): %.2f%n",
                analizador.promedioLikes("TWITTER"));
        System.out.printf("Promedio likes YouTube (Enero-Junio): %.2f%n",
                analizador.promedioLikes("YOUTUBE"));

        sc.close();
    }
}