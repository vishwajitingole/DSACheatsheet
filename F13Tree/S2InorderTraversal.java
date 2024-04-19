//In all of the traversal we will take

//TIme Complexity :- O(n)
//Auxiliary Space Complexity :- O(h)
//Where the h is the height of the tree

class Node {
    int key;
    Node left;
    Node right;
    Node(int k) {
        this.key=k;
    }
}

public class S2InorderTraversal {
    
   
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        inorder(root); 
    }    
}
