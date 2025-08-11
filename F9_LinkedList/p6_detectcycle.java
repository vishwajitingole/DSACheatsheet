
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

    public static boolean detectCycle(Node head) {
     if (head == null || head.next == null) return false;

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;         
        fast = fast.next.next;    

        if (slow == fast) {       
            return true;
        }
    }

    return false; 
    }

    public static void main(String[] args) {
        head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        detectCycle(head);

    }
}
