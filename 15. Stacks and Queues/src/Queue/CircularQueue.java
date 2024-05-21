package Queue;

public class CircularQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 5;
    private int size;

    int end = 0;
    int front = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.arr = new int[size];
    }

    boolean isFull() {
        return (size == arr.length);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int val) throws Exception { // INSERT
        if(isFull()) {
            throw new Exception("Queue is Full");
        }
        arr[end++] = val;
        end %= arr.length;
        size++;
    }

    public int dequeue() throws Exception{ // REMOVE
        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        int removed = arr[front++];
        front %= arr.length;
        size--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        return arr[front];
    }

    public void display() {
        System.out.print("FRONT -> ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " -> ");
        }
        System.out.println("END");
    }
}
