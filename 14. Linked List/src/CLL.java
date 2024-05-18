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
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println("HEAD");
    }

    Node find(int val) {
        Node node = head;
        while(node != null) {
            if(node.value == val) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public void remove(int val) {
        Node node = head;
        if(node == null) {
            return;
        }
        if(node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.value == val) {
                node.next = n.next;
            }
            node = node.next;
        } while (node != head);

    }
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
