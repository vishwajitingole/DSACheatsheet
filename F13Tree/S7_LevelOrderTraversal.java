import java.util.LinkedList;
import java.util.Queue;

// Node class to represent each node of the binary tree
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

// Class for level order traversal of binary tree
public class S7_LevelOrderTraversal {
    // Metod jo binary tree ko level order mein print karta hai
    static void levelOrder(Node root) {
        // Queue ka istemal karte hue har level ke nodes ko store karne ke liye
        Queue<Node> queue = new LinkedList<>();
        // agar root null hai toh kuch nahi karna hai
        if (root == null)
            return;
        // Queue mein root node ko add karna hai
        queue.add(root);
        // jab tak queue khali nahi hoti, tab tak loop chalta hai
        while (!queue.isEmpty()) {
            // Queue se current node ko remove karna hai
            Node temp = queue.poll();
            // Current node ka key print karna hai
            System.out.print(temp.key + " ");
            // agar current node ke left child hai, toh usse queue mein add karna hai
            if (temp.left != null)
                queue.add(temp.left);
            // agar current node ke right child hai, toh usse queue mein add karna hai
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        // Binary tree banane ke liye nodes ko initialize karna hai
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        // Level order traversal ko call karna hai
        System.out.println("Level Order Traversal:");
        levelOrder(root);
    }
}
