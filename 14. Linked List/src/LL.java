public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private static class Node {
        private final int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Get length
    public int length() {
        return size;
    }

    // Adding an Element
    void addStart(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        ++size;
    }

    void addEnd(int value) {
        if(tail == null) {
            addStart(value);
            size++;
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    void add(int value, int index) throws RuntimeException{
        if(index > size) {
            throw new RuntimeException("Index out of Bound");
        }
        if(index == 0) {
            addStart(value);
            return;
        }
        if(index == size) {
            addEnd(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        size++;
    }

    // Removing an Element
    int removeStart() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value; // Return removed element
    }

    int removeEnd() {
        if(size <= 1) {
            removeStart();
        }
        int value = tail.value;
        tail = get(size - 2);
        tail.next = null;
        size--;
        return value;
    }

    int remove(int index) {
        if(index == 0) return removeStart();
        if(index == size - 1) return removeEnd();
        Node current = get(index);
        Node prev = get(index - 1);
        int value = current.value; // prev.next.value
        prev.next =  current.next; // prev.next.next
        size--;
        return value;
    }

    // Get index of a Node
    Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Find Node with given value
    Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

    void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}