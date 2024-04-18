import java.util.*;

class Node{
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

class S1_BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(50);
        root.left.right = new Node(60);

    }
}