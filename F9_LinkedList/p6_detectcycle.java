
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class p6_detectcycle {
    public static Node head = null;

    public static void detectCycle(Node t) {
        while (t.next != null) {
            System.out.print(t.data);
        }
    }

    public static void main(String[] args) {
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        detectCycle(head);

    }
}
