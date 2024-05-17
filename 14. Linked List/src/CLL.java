public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    void addEnd(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            size++;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    void display() {
        
    }
    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
