public class LL_Palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) // Constructor
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    /////////////////////////////////////////////////////////

    public void addFirst(int data) // Method
    {
        // Create New Node:

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // New Node Next = Head:

        newNode.next = head;

        // Head = New Node:

        head = newNode;
    }

    /////////////////////////////////////////////////////////

    public void addLast(int data) // Method
    {
        // Create New Node:

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // New Node Next = Tail:

        tail.next = newNode;

        // Head = New Node:

        tail = newNode;
    }

    /////////////////////////////////////////////////////////

    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev

        newNode.next = temp.next;
        temp.next = newNode;
    }

    /////////////////////////////////////////////////////////
    public void print() {

        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->  ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    /////////////////////////////////////////////////////////
    public static void main(String[] args) {
        Create_LL ll = new Create_LL();
        System.out.println("---------------------");
        ll.print();
        System.out.println("---------------------");
        ll.addFirst(2);
        ll.print();
        System.out.println("---------------------");
        ll.addFirst(1);
        ll.print();
        System.out.println("---------------------");
        ll.addLast(3);
        ll.print();
        System.out.println("---------------------");
        ll.addLast(5);
        ll.print();
    }
}
