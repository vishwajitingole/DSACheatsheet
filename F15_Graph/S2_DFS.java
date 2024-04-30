import java.util.*;

public class S2_DFS {


    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    
    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Vertex" + i + ":- ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int start) {
        boolean visited[] = new boolean[adj.size()];
        dfsRec(adj, start, visited);
    }   

    public static void dfsRec(ArrayList<ArrayList<Integer>> adj,int start,boolean[] visited) {
        visited[start] = true;
        System.out.println(start);
        for (int neighbor : adj.get(start)) {
            if (visited[neighbor] == false) {
            dfsRec(adj, neighbor, visited);
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
                addEdge(adj, 0, 2);
                addEdge(adj, 2, 3);
                addEdge(adj, 4, 1);
                addEdge(adj, 2, 1);
                addEdge(adj, 3, 9);
                addEdge(adj, 0, 2);
                addEdge(adj, 7, 8);

        //print(adj);
        int start=0;

        DFS(adj, start);

    }
}
