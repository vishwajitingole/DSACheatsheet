package F14_BST;

 class Node{
     int key;
     Node left;
     Node right;

     Node(int x) {
         this.key = x;

     }
}

public class S1_SearchBST {
    static Node root;

    static void insert(int key) {

        root = insertRec(root, key);

    }

    static Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        } else if (root.key > key) {
          root.left=  insertRec(root.left, key);
        } else if (root.key < key) {
          root.right=  insertRec(root.right, key);
        }
        return root;
    }
    
    static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }

    }

   static Boolean search(Node root, int key) {
    if (root == null) {
        return false; // If root is null, the key is not found
    }

    if (root.key == key) {
        return true; 
    } else if (root.key < key) {
        return search(root.right, key);
    } else {
        return search(root.left, key); // Search in the left subtree
    }
}




    public static void main(String[] args) {

       
        insert(10);
        insert(3);
        insert(7);
        insert(1);
        
        insert(3);

        inorder(root);
        int key = 7;

       System.out.println( search(root,key));
        
    }
}
