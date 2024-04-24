package Generics;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size = 0;

    public CustomArrayList() {
        int DEFAULT_SIZE = 10;
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int remove(int i) {
        return data[--size];
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private void resize() {
        int[] temp = new int[2 * data.length];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        int[] arr = new int[size];
        System.arraycopy(data, 0, arr, 0, size);
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 1; i <= 15; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
        System.out.println(list.size());
        list.set(0, 1);
        System.out.println(list);
    }
}
