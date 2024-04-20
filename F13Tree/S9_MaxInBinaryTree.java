import java.util.Scanner;

class Node {
    int key;
    Node left;
    Node right;

    Node (int k) {
        this.key = k;
    }
}

public class S9_MaxInBinaryTree {
    public static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(max(root.left), max(root.right)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value of the root node:");
        int rootValue = scanner.nextInt();
        Node root = new Node(rootValue);

        // Queue to store nodes for level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            
            System.out.println("Enter the value of the left child of " + currentNode.key + " (or -1 if none):");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) {
                currentNode.left = new Node(leftValue);
                queue.add(currentNode.left);
            }

            System.out.println("Enter the value of the right child of " + currentNode.key + " (or -1 if none):");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) {
                currentNode.right = new Node(rightValue);
                queue.add(currentNode.right);
            }
        }
        
        scanner.close();

        int m = max(root);
        System.out.println("Maximum value in the binary tree: " + m);
    }
}
