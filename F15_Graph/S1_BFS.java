package F15_Graph;

import java.util.*;

public class S1_BFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Vertex" + i + ":-");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println(adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int start) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[adj.size()];

    queue.add(start);
    visited[start] = true;

    while (!queue.isEmpty()) {
        int currentNode = queue.poll();
        System.out.print(currentNode + " ");

        for (int neighbor : adj.get(currentNode)) {
            if (visited[neighbor]==false) {
                queue.add(neighbor);
                visited[neighbor] = true;
            }
        }
    }
}

    public static void main(String[] args) {
        int V = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        addEdge(adj, 0, 1);
        addEdge(adj, 2, 2);
        addEdge(adj, 3, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 3, 1);

        print(adj);

        BFS(adj,0);


    }
}


//Shortest path milta
//Social Network Search
//Cycle Detection
