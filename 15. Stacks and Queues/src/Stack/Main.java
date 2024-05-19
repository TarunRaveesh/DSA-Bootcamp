package Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        System.out.println("Custom Stack");
        CustomStack stack = new CustomStack(4);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.push(12);
//        stack.push(24); Error Stack is Full

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
        System.out.println();

        System.out.println("Dynamic Stack");
        DynamicStack stack1 = new DynamicStack();
//        CustomStack stack1 = new DynamicStack();
        stack1.push(4);
        stack1.push(7);
        stack1.push(9);
        stack1.push(12);
        stack1.push(31);
        stack1.push(42);
        stack1.push(70);
        stack1.push(92);
        stack1.push(127);
        stack1.push(311);

        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
        System.out.print(stack1.pop() + " ");
//        System.out.print(stack1.pop() + " "); Error Stack is Empty
    }
}
