class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class S4_PostOrderTraversal {
    public static void postorder(Node root) {
        if (root == null) {
            System.out.println(root);
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        postorder(root);
    }
}
