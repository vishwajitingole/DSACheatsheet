import java.util.ArrayList;

public class Scratch {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    
    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Vertex " + i + " :-");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj,int start) {
        
        

    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 0, 5);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 5, 4);

        print(adj);


        bfs(adj, 0);

    }
}