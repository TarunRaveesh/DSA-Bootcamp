import java.util.*;

public class Inbuilt {
    public static void main(String[] args) {
        System.out.println("Stack");
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(12);

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " "); // LIFO
//        System.out.print(stack.pop() + " "); // Empty Stack Exception
        System.out.println();

        System.out.println("Queue");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(15);
        queue.add(7);
        queue.add(5);

        System.out.println("Peek: " + queue.peek()); // Gives head (first element) of queue, without removing it
        System.out.println(queue.remove() + " ");
        System.out.println(queue.remove() + " "); // FIFO

        System.out.println("Deque");
        Deque<Integer> deque = new ArrayDeque<>();
    }
}
