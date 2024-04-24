package F15_Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class S5_TopoBFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v); // Note the change in parameter order
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Vertex " + i + " :-");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void topologicalBFS(ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            for (int v : adj.get(i)) {
                inDegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < adj.size(); i++) {
            if (inDegree[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : adj.get(u)) {
                if (--inDegree[v] == 0)
                    queue.add(v);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 0, 1); // Duplicate edge for testing
        addEdge(adj, 2, 1);
        addEdge(adj, 1, 3);
        
        System.out.println("Adjacency List:");
        print(adj);
        
        System.out.println("Topological Sort using BFS:");
        topologicalBFS(adj);
    }
}
