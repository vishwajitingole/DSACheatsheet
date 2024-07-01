public class p4_revll {
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
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void rev(Node h) {
        Node curr = h;
        Node prev = null;
        Node next=null;
        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }
    public static void main(String[] args) {
        add(0);
        add(2);
        add(3);
        add(4);
        printll(head);
        System.out.println();
        rev(head);
        printll(head);
        
    }
}
