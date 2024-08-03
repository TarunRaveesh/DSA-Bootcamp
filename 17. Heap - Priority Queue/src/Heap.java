import java.util.ArrayList;

public class Heap <T extends Comparable<T>> { // This implementation is min-heap
    private final ArrayList<T> list;

    public Heap() {
        this.list = new ArrayList<T>();
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    // Insert Element in Heap
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if(list.get(p).compareTo(list.get(index)) > 0) {
            swap(p, index);
            upHeap(p);
        }
    }

    // Remove element from Heap
    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Cannot remove, list is Empty!");
        }
        T temp = list.get(0);
        T last = list.get(list.size() - 1);
        if(!list.isEmpty()) {
            list.set(0, last);
        }
        downHeap(0);
        
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }


}
