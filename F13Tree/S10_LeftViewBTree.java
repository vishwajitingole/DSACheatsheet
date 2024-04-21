//Revising the traversal part

//inorder:- left top right
//preorder:- top left right
//postorder:- left right top

//So here preorder seems the most most suitable traversal mechanism to get our desied output

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
  }
}

public class S10_LeftViewBTree {
     static int maxLevel = 0;

    public static void leftView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(root.key);
            maxLevel = level;

        }
        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        leftView(root, 1);
    }
}