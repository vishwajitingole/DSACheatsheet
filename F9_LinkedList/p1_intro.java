public class p1_intro {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size=0; 

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        //If the LinkedList is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        //If the linkedlist is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void removeFirst(Node h) {
        if (size == 0) {
            System.out.println("Linkedlist is Empty");
        }
        else if(size==1){
            h = null;
        }
        head = h.next;
        return;
    }

    public void removeLast(Node h) {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return;
        }
        else if(size==1){
             h = null;
        }
        Node curr = head;
        for (int i = 0; i < size - 2; i++) {
            curr = curr.next;
        }
        curr.next = null;
        return;
    }

    public static void main(String[] args) {
        p1_intro li = new p1_intro();
        li.addFirst(0);
        li.addLast(1);
        li.addFirst(2);
        li.addFirst(4);
        li.addPos(3, 2);
        printll(head);
        li.removeLast(head);
        printll(head);

          
       
    }

    public static void printll(Node l) {
        Node curr = l;
        while (curr != null) {
            System.out.print(curr.data + "-> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public  void addPos(int data, int pos) {
        int i = 0;
        Node curr = head;
        while (i < pos-1) {
            curr = curr.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = curr.next;
        curr.next = newNode;
        
    }
}
