package F15_Graph;
import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src; // Source vertex of the edge
        this.dest = dest; // Destination vertex of the edge
        this.weight = weight; // Weight of the edge
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight; // Compare edges based on their weights
    }
}

public class S8_Kruskal {

    public static List<Edge> kruskalMST(List<Edge> edges, int numVertices) {
        // Sort the edges by weight
        Collections.sort(edges);

        // Create a parent array to track connected components
        int[] parent = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            parent[i] = i; // Initially, each vertex is its own parent
        }

        List<Edge> mst = new ArrayList<>(); // List to store MST edges

        // Iterate through sorted edges and add to MST if they don't form a cycle
        for (Edge edge : edges) {
            int srcRoot = find(parent, edge.src); // Find root of source vertex's component
            int destRoot = find(parent, edge.dest); // Find root of destination vertex's component

            // If adding this edge doesn't form a cycle, add it to the MST
            if (srcRoot != destRoot) {
                mst.add(edge); // Add the edge to the MST
                union(parent, srcRoot, destRoot); // Merge the components
            }
        }

        return mst; // Return the MST
    }

    // Find operation to find the root of a component
    private static int find(int[] parent, int vertex) {
        while (parent[vertex] != vertex) {
            vertex = parent[vertex]; // Move up the parent chain until root is found
        }
        return vertex; // Return the root of the component
    }

    // Union operation to merge two components
    private static void union(int[] parent, int x, int y) {
        int xRoot = find(parent, x); // Find root of component containing x
        int yRoot = find(parent, y); // Find root of component containing y
        parent[yRoot] = xRoot; // Make y's root point to x's root
    }

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>(); // List to store graph edges
        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 3, 6));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 8));
        edges.add(new Edge(1, 4, 5));
        edges.add(new Edge(2, 4, 7));
        edges.add(new Edge(3, 4, 9));

        List<Edge> mst = kruskalMST(edges, 5); // Call Kruskal's algorithm to find MST
        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : mst) {
            System.out.println("Edge: " + edge.src + " - " + edge.dest + ", Weight: " + edge.weight);
        }
    }
}
