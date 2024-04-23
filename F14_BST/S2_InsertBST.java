package F14_BST;
class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}

public class S2_InsertBST {
    static Node root;

    public static Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        root = insertRec(root, 10);
        insertRec(root, 20);
        insertRec(root, 12);
        insertRec(root, 9);
        insertRec(root, 13);
        inorder(root);
    }
}
