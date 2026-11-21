package Grafos;
import java.util.*;

public class GrafoRecorridos {

    private Map<Character, List<Character>> adyacencia;

    public GrafoRecorridos() {
        adyacencia = new HashMap<>();
        inicializarGrafo();
    }

    private void inicializarGrafo() {
        // vecinos en orden alfabetic
        adyacencia.put('A', Arrays.asList('B', 'C'));
        adyacencia.put('B', Arrays.asList('A', 'D', 'E'));
        adyacencia.put('C', Arrays.asList('A', 'F', 'G'));
        adyacencia.put('D', Arrays.asList('B', 'H'));
        adyacencia.put('E', Arrays.asList('B', 'H', 'I'));
        adyacencia.put('F', Arrays.asList('C', 'I', 'J'));
        adyacencia.put('G', Arrays.asList('C', 'J'));
        adyacencia.put('H', Arrays.asList('D', 'E', 'I'));
        adyacencia.put('I', Arrays.asList('E', 'F', 'H', 'J'));
        adyacencia.put('J', Arrays.asList('F', 'G', 'I'));
    }

    // ---------- BFS ----------
    public List<Character> bfs(char inicio) {
        List<Character> recorrido = new ArrayList<>();
        Set<Character> visitados = new HashSet<>();
        Queue<Character> cola = new LinkedList<>();

        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            char actual = cola.poll();
            recorrido.add(actual);

            for (char vecino : adyacencia.get(actual)) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }
        return recorrido;
    }

    // ---------- DFS Iterativo ----------
    public List<Character> dfsIterativo(char inicio) {
        List<Character> recorrido = new ArrayList<>();
        Set<Character> visitados = new HashSet<>();
        Deque<Character> pila = new ArrayDeque<>();

        pila.push(inicio);

        while (!pila.isEmpty()) {
            char actual = pila.pop();

            if (!visitados.contains(actual)) {
                visitados.add(actual);
                recorrido.add(actual);

                List<Character> vecinos = adyacencia.get(actual);
                for (int i = vecinos.size() - 1; i >= 0; i--) {
                    char vecino = vecinos.get(i);
                    if (!visitados.contains(vecino)) {
                        pila.push(vecino);
                    }
                }
            }
        }
        return recorrido;
    }

    // ---------- DFS Recursivo ----------
    public List<Character> dfsRecursivo(char inicio) {
        List<Character> recorrido = new ArrayList<>();
        Set<Character> visitados = new HashSet<>();
        dfsHelper(inicio, visitados, recorrido);
        return recorrido;
    }

    private void dfsHelper(char actual, Set<Character> visitados, List<Character> recorrido) {
        visitados.add(actual);
        recorrido.add(actual);

        // *En recursivo no invertimos, se recorre natural alfabético
        for (char vecino : adyacencia.get(actual)) {
            if (!visitados.contains(vecino)) {
                dfsHelper(vecino, visitados, recorrido);
            }
        }
    }
}
