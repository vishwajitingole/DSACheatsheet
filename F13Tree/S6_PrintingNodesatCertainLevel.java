//THis involves printing the nodes which are at certain distance from the root node
import java.util.*;
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class S6_PrintingNodesatCertainLevel {
    public static void printnode(Node root,int h) {
        if (root == null) {
            return;
        }
        if (h == 0) {
            System.out.println(root.key);
        }
        else {
            printnode(root.left, h-1);
            printnode(root.right, h-1);

        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(40);
        root.right.left = new Node(50);
        System.out.println("At which level would you like to print Nodes ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

printnode(root, h);

      



    }
}
