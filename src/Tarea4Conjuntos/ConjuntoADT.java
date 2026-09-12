package Tarea4Conjuntos;


import java.util.HashSet;

public class ConjuntoADT<T> {
    private HashSet<T> elementos;

    public ConjuntoADT(){
        this.elementos = new HashSet<>();
    }

    @Override
    public String toString() {
        return "ConjuntoADT{" +
                "elementos=" + elementos +
                '}';
    }

    public HashSet<T> getElementos() {
        return elementos;
    }

    public void setElementos(HashSet<T> elementos) {
        this.elementos = elementos;
    }

    public int longitud(){
        return elementos.size();
    }

    public void agregarElemento(T elemento){
        elementos.add(elemento);
    }

    public boolean contieneElemento(T elemento){
        return elementos.contains(elemento);
    }

    // --- Operaciones de conjuntos ---
    public ConjuntoADT<T> union(ConjuntoADT<T> otro) {
        ConjuntoADT<T> resultado = new ConjuntoADT<>();
        resultado.elementos.addAll(this.elementos);
        resultado.elementos.addAll(otro.elementos);
        return resultado;
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> otro) {
        ConjuntoADT<T> resultado = new ConjuntoADT<>();
        for (T elem : this.elementos) {
            if (otro.elementos.contains(elem)) {
                resultado.agregarElemento(elem);
            }
        }
        return resultado;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otro) {
        ConjuntoADT<T> resultado = new ConjuntoADT<>();
        for (T elem : this.elementos) {
            if (!otro.elementos.contains(elem)) {
                resultado.agregarElemento(elem);
            }
        }
        return resultado;
    }


}
