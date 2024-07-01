public class p3_recSearch {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public static void printll(Node h) {
        Node curr = h;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void recSearch( Node curr, int key,int pos) {
        if (curr == null) {
            System.out.println("Key not found");
            return;
        }
        if (curr.data == key) {
            System.out.println("Key Found at "+(pos+1));
            return;
        }
        recSearch(curr.next, key,pos+1);
    }
    public static void main(String arg[]) {
        add(0);
        add(1);
        add(3);
        add(4);
        add(10);
        printll(head);
        recSearch(head, 8,0);
    }
}
