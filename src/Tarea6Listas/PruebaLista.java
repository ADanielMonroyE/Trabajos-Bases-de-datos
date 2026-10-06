package Tarea6Listas;

public class PruebaLista {
    public static void main(String[] args) {

        ListaLigada<PolloAsado> lista = new ListaLigada<>();

        PolloAsado p1 =
                new PolloAsado("Ranchero",150,8,true);

        PolloAsado p2 =
                new PolloAsado("Enchilado",170,8,true);

        PolloAsado p3 =
                new PolloAsado("A la diabla",180,8,false);

        System.out.println("¿Lista vacía?: " +
                lista.estaVacia());

        lista.agregar(p1);
        lista.agregar(p2);
        lista.agregarAlInicio(p3);

        System.out.println("\nElementos:");
        lista.transversal();

        System.out.println(
                "\nTamaño: " + lista.getTamanio());

        int pos = lista.buscar(p2);

        System.out.println(
                "\nPosición de p2: " + pos);

        PolloAsado nuevo =
                new PolloAsado(
                        "Pollo BBQ",
                        190,
                        8,
                        true);

        lista.actualizar(p2, nuevo);

        System.out.println("\nDespués de actualizar:");
        lista.transversal();

        lista.eliminarElPrimero();

        System.out.println("\nDespués de eliminar primero:");
        lista.transversal();
        lista.eliminarElFinal();

        System.out.println("\nDespués de eliminar último:");
        lista.transversal();

        System.out.println(
                "\nTamaño final: " +
                        lista.getTamanio());
    }
}
