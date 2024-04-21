class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class S11_ChildrenSum {
    
    public static boolean isCsum(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int sum = 0;
        if (root.left != null) {
            sum += root.left.key;
        }
        if (root.right != null) {
            sum +=  root.right.key;
        }
        return (root.key == sum && isCsum(root.left)&& isCsum(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.right.right = new Node(3);
        root.right.left = new Node(2);
       boolean ChildSum= isCsum(root);
       System.out.println(ChildSum);
    }
}
