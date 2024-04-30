import java.util.*;

public class Scratch {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("Vertex " + i + " :-");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
    
   public static void topo(ArrayList<ArrayList<Integer>> adj, int start) {
    int inDegree[] = new int[adj.size()];
    Queue<Integer> q = new LinkedList<>();

    // Calculate in-degree for each vertex
    for (int i = 0; i < adj.size(); i++) {
        for (int v : adj.get(i)) {
            inDegree[v]++;
        }
    }

    // Add vertices with in-degree 0 to the queue
    for (int i = 0; i < adj.size(); i++) {
        if (inDegree[i] == 0) {
            q.add(i);
        }
    }

    // Process the vertices in topological order
    while (!q.isEmpty()) {
        int data = q.poll();
        System.out.println(data);
        for (int v : adj.get(data)) {
            if (--inDegree[v] == 0) {
                q.add(v);
            }
        }
    }

   
}

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
       addEdge(adj, 0, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 5);
        addEdge(adj, 0, 5);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 3, 5);
        addEdge(adj, 5, 2);

        
        print(adj);

        topo(adj, 0);
    }
}