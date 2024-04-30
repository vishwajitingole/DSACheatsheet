import java.util.Arrays;

public class AdjacencyMatrix {
    static void printAdjacencyMatrix(int[][] adjMatrix) {
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices

        // Initialize adjacency matrix with all zeros
        int[][] adjMatrix = new int[V][V];
        for (int i = 0; i < V; i++) {
            Arrays.fill(adjMatrix[i], 0);
        }

        // Add edges
        addEdge(adjMatrix, 0, 1);
        addEdge(adjMatrix, 0, 2);
        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 1, 3);

        // Print adjacency matrix
        printAdjacencyMatrix(adjMatrix);
    }

    static void addEdge(int[][] adjMatrix, int u, int v) {
        // For undirected graph, set both adjMatrix[u][v] and adjMatrix[v][u] to 1
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }
}
