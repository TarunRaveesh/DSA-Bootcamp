package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public void enqueue(int val) throws Exception {
        if(isFull()) {
            resize();
        }
        super.enqueue(val);
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(front + i) % arr.length];
        }
        front = 0;
        end = arr.length;
        arr = temp;
    }
}
