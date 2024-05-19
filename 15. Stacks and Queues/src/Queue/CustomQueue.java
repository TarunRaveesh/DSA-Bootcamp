package Queue;

public class CustomQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.arr = new int[size];
    }

    boolean isFull() {
        return (end == arr.length);
    }

    boolean isEmpty() {
        return (end == 0);
    }

    public void enqueue(int val) throws Exception { // INSERT
        if(isFull()) {
            throw new Exception("Queue is Full");
        }
        arr[end++] = val;
    }

    public int dequeue() throws Exception{ // REMOVE
        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        int removed = arr[0];
        for (int i = 1; i < end; i++) {
            arr[i - 1] = arr[i];
        }
        end--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        return arr[0];
    }

    public void display() {
        System.out.print("START ");
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("END");
    }
}
