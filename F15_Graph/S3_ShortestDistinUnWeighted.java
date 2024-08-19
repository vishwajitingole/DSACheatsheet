import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S3_ShortestDistinUnWeighted {
    public static void addEdge(ArrayList<ArrayList<Integer>> g, int u, int v) {
        g.get(v).add(u);
        g.get(u).add(v);
    }

    public static void main(String arg[]) {
        int V = 4;
        ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            g.add(new ArrayList<Integer>());
        }
        addEdge(g, 0, 1);
        addEdge(g, 0, 2);
        addEdge(g, 1, 2);
        addEdge(g, 1, 3);

        shortestPath(g, V, 0);
    }

    public static void shortestPath(ArrayList<ArrayList<Integer>> g, int V, int start) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : g.get(node)) {
                if (dist[node] + 1 < dist[neighbor]) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }
        for (int i = 0; i < V; i++) {
            System.out.println("For node " + i + " Distance from 0 is " + dist[i]);
        }
    }
}
