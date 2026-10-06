package Tarea6Listas;

public class ListaLigada<T> {

    private Nodo<T> head;
    private int tamanio;

    public ListaLigada() {
        head = null;
        tamanio = 0;
    }

    // esta_vacia()
    public boolean estaVacia() {
        return head == null;
    }

    // get_tamanio()
    public int getTamanio() {
        return tamanio;
    }

    // Agregar(valor)
    public void agregar(T valor) {
        agregarAlFinal(valor);
    }

    // agregar al inicio(valor)
    public void agregarAlInicio(T valor) {

        Nodo<T> nuevo = new Nodo<>(valor);

        nuevo.setSiguiente(head);
        head = nuevo;

        tamanio++;
    }

    // agregar al final(valor)
    public void agregarAlFinal(T valor) {

        Nodo<T> nuevo = new Nodo<>(valor);

        if (estaVacia()) {
            head = nuevo;
        } else {

            Nodo<T> aux = head;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }

        tamanio++;
    }

    // agregar despues de(referencia, valor)
    public boolean agregarDespuesDe(T referencia, T valor) {

        Nodo<T> aux = head;

        while (aux != null) {

            if (aux.getDato().equals(referencia)) {

                Nodo<T> nuevo = new Nodo<>(valor);

                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);

                tamanio++;
                return true;
            }

            aux = aux.getSiguiente();
        }

        return false;
    }

    // eliminar el primero()
    public boolean eliminarElPrimero() {

        if (estaVacia()) {
            return false;
        }

        head = head.getSiguiente();
        tamanio--;

        return true;
    }

    // eliminar el final()
    public boolean eliminarElFinal() {

        if (estaVacia()) {
            return false;
        }

        if (head.getSiguiente() == null) {
            head = null;
            tamanio--;
            return true;
        }

        Nodo<T> actual = head;
        Nodo<T> anterior = null;

        while (actual.getSiguiente() != null) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        anterior.setSiguiente(null);

        tamanio--;

        return true;
    }

    // buscar(valor)
    public int buscar(T valor) {

        Nodo<T> aux = head;
        int posicion = 0;

        while (aux != null) {

            if (aux.getDato().equals(valor)) {
                return posicion;
            }

            aux = aux.getSiguiente();
            posicion++;
        }

        return -1;
    }

    // actualizar(a_buscar, valor)
    public boolean actualizar(T buscar, T nuevoValor) {

        Nodo<T> aux = head;

        while (aux != null) {

            if (aux.getDato().equals(buscar)) {

                aux.setDato(nuevoValor);
                return true;
            }

            aux = aux.getSiguiente();
        }

        return false;
    }

    // transversal()
    public void transversal() {

        Nodo<T> aux = head;

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
}