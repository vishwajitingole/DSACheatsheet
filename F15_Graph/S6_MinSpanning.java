

//This algorithm is going to find minimum wirelength 
//which will the required to connect all the nodes which are placed
//at a Distant

//In spanning we don't create cycle we just connect all the vertices

//Technical terms mein bola jaaye toh minimum weights required to connect 
//All the edges

import java.util.*;
import java.util.Arrays;

public class S6_MinSpanning {
    // primMST function jisme MST nikala jaata hai
    public static void primMST(int[][] graph) {
        int n = graph.length; // Number of vertices in the graph
        int[] parent = new int[n]; // Array to store parents of vertices in MST
        int[] dist = new int[n]; // Array to store distances of vertices from MST
        boolean[] visited = new boolean[n]; // Array to keep track of visited vertices
        
        // Initialize arrays
        Arrays.fill(dist, Integer.MAX_VALUE); // Sabhi vertices ka distance ko infinity se initialize kiya jaata hai
        dist[0] = 0; // Start vertex se shuru kiya jaata hai

        // MST nikalne ka process
        for (int i = 0; i < n - 1; i++) {
            int u = minKey(dist, visited); // Sabse chhota distance wala vertex select kiya jaata hai
            visited[u] = true; // Us vertex ko visited mark kiya jaata hai

            // Us vertex ke saare adjacent vertices ke liye loop chalaya jaata hai
            for (int v = 0; v < n; v++) {
                // Agar edge exist karta hai aur woh vertex visited nahi hai aur current distance se chhota hai
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < dist[v]) {
                    parent[v] = u; // Us vertex ka parent u mark kiya jaata hai
                    dist[v] = graph[u][v]; // Us vertex ka distance update kiya jaata hai
                }
            }
        }

        // Print MST edges and their weights
        for (int i = 1; i < n; i++) {
            // Har vertex ka parent print kiya jaata hai, jo MST mein connected hai
            System.out.println("Edge: " + parent[i] + " - " + i + ", Weight: " + graph[i][parent[i]]);
        }
    }

    // minKey function jisme minimum distance wala vertex find kiya jaata hai
    private static int minKey(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            // Agar vertex visited nahi hai aur uska distance minimum hai
            if (!visited[v] && dist[v] < min) {
                min = dist[v]; // Minimum distance ko update kiya jaata hai
                minIndex = v; // Minimum distance wala vertex ka index store kiya jaata hai
            }
        }
        return minIndex; // Minimum distance wala vertex ka index return kiya jaata hai
    }

    public static void main(String[] args) {
        int n = 5; // Graph mein vertices ki sankhya
        int[][] graph = {
                {0, 2, 0, 6, 0}, // Graph ke adjacency matrix
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        primMST(graph); // Prim's algorithm ka function call kiya jaata hai, jisme MST nikala jaata hai
    }
}
