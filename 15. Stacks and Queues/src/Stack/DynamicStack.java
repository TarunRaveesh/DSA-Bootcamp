package Stack;

import java.util.Arrays;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super(); // Will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // Will call CustomStack(int size)
    }

    @Override
    public void push(int val) throws StackException {
        if(isFull()) {
            resize();
        }
        super.push(val);
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }
}
