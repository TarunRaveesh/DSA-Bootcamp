import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(27);
        heap.insert(14);
        heap.insert(22);
        heap.insert(45);
        heap.insert(19);
        heap.insert(30);

        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
}