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
    // Ek array banaya hai jisme har vertex ka indegree store hoga
    int[] inDegree = new int[adj.size()];
    // Har vertex ka indegree calculate kiya ja raha hai
   for (int i = 0; i < adj.size(); i++) {
    // adj.get(i) se hum i-th vertex ke adjacent vertices ka list le rahe hain
    for (int v : adj.get(i)) {
        // Har adjacent vertex ke liye uska indegree badha rahe hain
        inDegree[v]++;
    }
            }


    // Ek queue banaya hai jisme un vertices ko store kiya jayega jinke indegree 0 hai
    Queue<Integer> queue = new LinkedList<>();
    // Sabse pehle woh vertices queue mein daale jinke indegree 0 hai
    for (int i = 0; i < adj.size(); i++) {
        if (inDegree[i] == 0)
            queue.add(i);
    }

    // Jab tak queue khali nahi hoti
    while (!queue.isEmpty()) {
        // Queue se ek vertex nikali jati hai
        int u = queue.poll();
        // Us vertex ko print kiya jata hai
        System.out.print(u + " ");
        // Us vertex se jo vertices connected hain, unka indegree kam kiya jata hai
        for (int v : adj.get(u)) {
            if (--inDegree[v] == 0)
                queue.add(v); // Agar kisi vertex ka indegree 0 ho jata hai, toh usko queue mein daala jata hai
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
