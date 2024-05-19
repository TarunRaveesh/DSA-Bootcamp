package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();

        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(12);
        queue.enqueue(16);
        queue.display();

        queue.dequeue();
        queue.display();
    }
}
