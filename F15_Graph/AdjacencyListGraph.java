package F15_Graph;
import java.util.*;


public class AdjacencyListGraph {
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        //Ye undirected graph hai naa isiliye  
        //toh jab u se v kaa connection banega toh v se u kaa bhi banega
        adj.get(v).add(u);
    }

    static void print(ArrayList<ArrayList<Integer>> adj) {
    for (int i = 0; i < adj.size(); i++) {
        System.out.print("Vertex " + i + ": ");
  
        for (int j = 0; j < adj.get(i).size(); j++) {
            System.out.print(adj.get(i).get(j) + " ");
        }
        System.out.println();
    }
}


    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        print(adj);

    }
    
}
