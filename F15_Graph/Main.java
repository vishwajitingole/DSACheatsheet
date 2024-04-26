package F15_Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[adj.size()];
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.println(curr); // Move print inside the loop to print each vertex as it's visited

            for (int baajuwala : adj.get(curr)) {
                if (!visited[baajuwala]) {
                    q.add(baajuwala);
                    visited[baajuwala] = true;
                }
            }
        }
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        dfsRec(adj, visited,0);
    }

    public static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited,int start) {
        visited[start] = true;
        System.out.print(start+" ");
        for (int baajuwala : adj.get(start)) {
            if (!visited[start]) {
                dfsRec(adj, visited, baajuwala);
            }
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(5);
        
        for (int i = 0; i < 5; i++) {
    adj.add(new ArrayList<Integer>());
}


        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
       // print(adj);
        bfs(adj, 0);
    }
}
