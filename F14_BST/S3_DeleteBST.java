package F14_BST;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}

public class S3_DeleteBST {
    static Node root;

    public static void insert(int key) {
        root = insertRec(root, key);
    }

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

    public static Node minValueNode(Node node) {
        Node current = node;
        // Loop down to find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static Node delNode(Node root, int x) {
        if (root == null) {
            return null;
        }

        // Traverse down the tree
        if (x < root.key) {
            root.left = delNode(root.left, x);
        } else if (x > root.key) {
            root.right = delNode(root.right, x);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.key = minValueNode(root.right).key;

            // Delete the inorder successor
            root.right = delNode(root.right, root.key);
        }
        return root;
    }



    public static Boolean search(Node root,int key){
    
    if(root==null){
    return false;
    }
    
    if(root.key==key){
    return true;
    }
    else if(root.key<key){
   return search(root.right,key);
    }
    else{
   return search(root.left,key);
    }
  
    
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(12);
        insert(9);
        insert(13);
        System.out.println("Inorder traversal before deletion:");
        inorder(root);

        int keyToDelete = 12;
        root = delNode(root, keyToDelete);
        System.out.println("\nInorder traversal after deletion of " + keyToDelete + ":");
        inorder(root);
         System.out.print( search(root,9));
    }
}
