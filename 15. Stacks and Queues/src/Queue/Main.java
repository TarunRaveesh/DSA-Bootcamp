package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue();
//        queue.enqueue(2);
//        queue.enqueue(4);
//        queue.enqueue(7);
//        queue.enqueue(12);
//        queue.enqueue(16);
//        queue.display();
//
//        System.out.println(queue.dequeue());
//        queue.display();

        System.out.println("Circular Queue");
        CircularQueue queue1 = new CircularQueue();
        queue1.enqueue(2);
        queue1.enqueue(4);
        queue1.enqueue(7);
        queue1.enqueue(12);
        queue1.enqueue(16);
        queue1.display();

        System.out.println(queue1.dequeue());
        queue1.display();

        queue1.enqueue(19);
        queue1.display();
        System.out.println(queue1.peek());

        System.out.println("Dynamic Queue");
        DynamicQueue queue2 = new DynamicQueue();
//        CircularQueue queue2 = new DynamicQueue();
        queue2.enqueue(2);
        queue2.enqueue(4);
        queue2.enqueue(7);
        queue2.enqueue(12);
        queue2.enqueue(16);
        queue2.enqueue(19);
        queue2.display();
    }
}
