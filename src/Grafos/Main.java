package Grafos;

public class Main {
    public static void main(String[] args) {
        GrafoRecorridos grafo = new GrafoRecorridos();
        char inicio = 'A';

        System.out.println("===== BFS (Amplitud) =====");
        System.out.println("Secuencia: " + grafo.bfs(inicio));

        System.out.println("\n===== DFS Iterativo =====");
        System.out.println("Secuencia: " + grafo.dfsIterativo(inicio));

        System.out.println("\n===== DFS Recursivo =====");
        System.out.println("Secuencia: " + grafo.dfsRecursivo(inicio));
    }
}

