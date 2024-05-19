package Stack;

public class CustomStack {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.arr = new int[size];
    }

    public void push(int val) throws StackException {
        if(isFull()) {
            throw new StackException("Can't PUSH, Stack is Full!");
        }
        ptr++;
        arr[ptr] = val;
    }

    public int pop() throws StackException{
        if(isEmpty()) {
            throw new StackException("Can't POP, Stack is Empty!");
        }
        return arr[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Can't PEEK, Stack is Empty!");
        }
        return arr[ptr];
    }

    boolean isFull() {
        return (ptr == arr.length - 1);
    }

    boolean isEmpty() {
        return (ptr == -1);
    }
}
