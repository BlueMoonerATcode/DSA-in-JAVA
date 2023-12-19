//Floyed Cycle Finding Algorithm

public class Check_Loop {

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

    public static boolean isCycle() {
        Node Slow = head;
        Node Fast = head;

        while (Fast != null && Fast.next != null) {

            Slow = Slow.next;
            Fast = Fast.next.next;

            if (Slow == Fast) {
                return true;
            }
        }
        return false;
    }

    /////////////////////////////////////////////////////////

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head;
        System.out.println(isCycle());
    }
}