package Tarea4Conjuntos;

public class Main {
    public static void main(String[] args) {
        // Crear conjuntos de materias para Ana y Luis
        ConjuntoADT<String> Ana = new ConjuntoADT<>();
        Ana.agregarElemento("ED");
        Ana.agregarElemento("BD");
        Ana.agregarElemento("Redes");
        Ana.agregarElemento("IA");

        ConjuntoADT<String> Luis = new ConjuntoADT<>();
        Luis.agregarElemento("ED");
        Luis.agregarElemento("Redes");
        Luis.agregarElemento("SO");

        // Mostrar conjuntos
        System.out.println("Materias de Ana: " + Ana);
        System.out.println("Materias de Luis: " + Luis);

        // Unión: todas las materias inscritas por ambos
        ConjuntoADT<String> union = Ana.union(Luis);
        System.out.println("Unión: " + union);

        // Intersección: materias comunes
        ConjuntoADT<String> interseccion = Ana.interseccion(Luis);
        System.out.println("Intersección: " + interseccion);

        // Diferencia: materias exclusivas de cada uno
        ConjuntoADT<String> diferenciaAnaLuis = Ana.diferencia(Luis);
        System.out.println("Diferencia: " + diferenciaAnaLuis);

        ConjuntoADT<String> diferenciaLuisAna = Luis.diferencia(Ana);
        System.out.println("Diferencia: " + diferenciaLuisAna);

        // Diferencia simétrica: materias distintas entre ambos
        ConjuntoADT<String> diferenciaSimetrica = union.diferencia(interseccion);
        System.out.println("Diferencia simétrica: " + diferenciaSimetrica);
    }
}

