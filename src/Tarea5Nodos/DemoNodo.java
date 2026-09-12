package Tarea5Nodos;

public class DemoNodo {
    public static void main(String[] args) {
        System.out.println("Hola demo nodo");

        System.out.println("---------------");
        System.out.println("Construye manualmente una lista enlazada equivalente a la mostrada en la imagen");
        Nodo<String> head = new Nodo<>("AI", new Nodo<>("B",new Nodo<>("C",new Nodo<>("De",new Nodo<>("Mc",new Nodo<>("Zi"))))));
        System.out.println(head);

        System.out.println("---------------");
        System.out.println("Imprime el estado inicial completo de la lista:");

        Nodo<String> temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.getDato() + " -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");

        System.out.println("---------------");
        System.out.println("Imprime únicamente el dato almacenado en el primer nodo de la lista.");
        System.out.println("Primer dato: " + head.getDato());

        System.out.println("---------------");
        System.out.println("Imprime el estado completo del nodo ubicado en la última posición de la lista.");
        System.out.println("Ultimo dato: " + head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getDato());

        System.out.println("----------------");
        System.out.println("Inserta un nuevo nodo con el valor *Fe* entre los nodos que contienen *De* y *Mc*.");

        // Crear un nuevo nodo
        Nodo<String> nuevo = new Nodo<>("Fe");

        // Variable para recorrer los nodos
        Nodo<String> cursor = head;
        while (cursor != null) {
            if (cursor.getDato().equals("De")) {
                Nodo<String> siguiente = cursor.getSiguiente();
                cursor.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                break;
            }
            cursor = cursor.getSiguiente();
        }

        System.out.println("---------------");
        System.out.println("Imprime el nuevo estado de la lista.");
        Nodo<String> temp2 = head;
        System.out.print("head -> ");
        while (temp2 != null) {
            System.out.print(temp2.getDato() + " -> ");
            temp2 = temp2.getSiguiente();
        }
        System.out.println("null");

        System.out.println("-------------");
        System.out.println("Inserta un nuevo nodo con el valor *Zz* al final de la lista.");
        // Nuevo nodo
        Nodo<String> nuevoNodo = new Nodo<>("Zz");
        //Insertar nodo
        Nodo<String> cursor2 = head;
        while (cursor2 !=null){
            if(cursor2.getDato().equals("Zi")){
                Nodo<String> siguiente1 = cursor2.getSiguiente();
                cursor2.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(siguiente1);
                break;
            }
            cursor2 = cursor2.getSiguiente();
        }

        System.out.println("--------------");
        System.out.println("Imprime el nuevo estado de la lista.");
        Nodo<String> temp3 = head;
        System.out.print("head -> ");
        while(temp3 != null){
            System.out.print(temp3.getDato() + " -> ");
            temp3 = temp3.getSiguiente();
        }
        System.out.println("null");

        System.out.println("---------------");
        System.out.println("Inserta un nuevo nodo con el valor *Aa* al inicio de la lista, de modo que se convierta en el primer nodo.");
        // Crear el nuevo nodo y enlazarlo al head actual
        Nodo<String> nuevoHead = new Nodo<>("Aa");
        nuevoHead.setSiguiente(head);
        // Actualizar head para que apunte al nuevo nodo
        head = nuevoHead;

        System.out.println("----------------------");
        System.out.println("Imprime el estado final de la lista.");
        Nodo<String> tempFinal = head;
        System.out.print("head -> ");
        while (tempFinal != null) {
            System.out.print(tempFinal.getDato() + " -> ");
            tempFinal = tempFinal.getSiguiente();
        }
        System.out.println("null");


    }
}

