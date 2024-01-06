import java.util.*;

public class Create_LL {

    /////////////////////////////////////////////////////////

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

    public int remove_first() {
        if (size == 0) {
            System.out.println("Error: Your Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    /////////////////////////////////////////////////////////

    public int remove_last() {
        if (size == 0) {
            System.out.println("Error: Your Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // previous = size - 2 = i
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    /////////////////////////////////////////////////////////
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    /////////////////////////////////////////////////////////
    public int rec_search(int key) {
        return helper(head, key);
    }

    /////////////////////////////////////////////////////////
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /////////////////////////////////////////////////////////
    public void delete_from_end(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // Remove First
            return;
        }

        int i = 1;
        int i_to_find = sz - n;
        Node prev = head;
        while (i < i_to_find) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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
        System.out.println("---------------------");
        ll.add(3, 4);
        ll.print();
        System.out.println("---------------------");
        System.out.println("Removing 2nd node from End...");
        ll.delete_from_end(2);
        ll.print();
        System.out.println("----------------------");
        // System.out.println("Reversing Linked List...");
        // ll.reverse();// Reversed
        // ll.print();
        // System.out.println("---------------------");
        // System.out.println("---------------------");
        // ll.remove_first();
        // ll.print();
        // System.out.println("---------------------");
        // ll.remove_last();
        // ll.print();
        // System.out.println("---------------------");
        // System.out.println("Size of LL is: " + ll.size);
        // System.out.println("---------------------");
        // System.out.println("Finding 4 via Recursive Search: " + ll.rec_search(4) + "nd Index.");
        // System.out.println("---------------------");

    }
}
