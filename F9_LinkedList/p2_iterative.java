
public class p2_iterative {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static int size=0;

    public static void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            size++;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            size++;
        }

    }

    public static void search(Node h, int key) {
        Node curr = h;
        int pos = 0;
        while (curr != null) {
            pos++;
            if (curr.data == key) {
                System.out.println("Key Found at Position " + pos);
                return;
            }
            curr = curr.next;

        }
        System.out.println("Key not found");
    }

    public static void printll(Node h) {
        Node curr = h;
         while (curr != null) {
             System.out.println(curr.data);
             curr = curr.next;
            }
    }
   
    public static void main(String[] args) {
        
        add(0);
        add(2);
        add(9);
        add(3);
        printll(head);
        search(head,1);
    }
}
