class Node {
      int key;
      Node left;
      Node right;
    Node(int k) {
        this.key = k;
    }
}

public class S3_PreOrderTraversal {
    public static void preorder(Node root) {
        if (root==null) {
            return;
        }
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        preorder(root);
    }
}
