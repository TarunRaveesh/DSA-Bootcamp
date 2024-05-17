public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public int length(){
        return size;
    }

    public void addStart(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void addEnd(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
             head = node;
            size++;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    void add(int val, int after) {
        Node node = new Node(val);
        Node p = find(after);
        if(p == null) {
            return;
        }
        if(head == null) {
            addStart(val);
            size++;
            return;
        }
        if(p.next == null) {
            addEnd(val);
            size++;
            return;
        }
        node.next = p.next;
        p.next = node;
        node.prev = p;
        node.next.prev = node;
        size++;
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

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}


