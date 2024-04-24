package Generics;

import java.util.Arrays;
import java.util.List;

//public class CustomGenArrayList <T extends Number> { // WildCard Example - T should be of type Number or its subclass
public class CustomGenArrayList <T> {
    private Object[] data;
    private int size = 0;

    public CustomGenArrayList() {
        int DEFAULT_SIZE = 10;
        this.data = new Object[DEFAULT_SIZE];
    }

    private void resize() {
        Object[] temp = new Object[2 * data.length];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void getList(List<? extends Number> list) { // Wildcard usage
        //do something
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        Object[] arr = new Object[size];
        System.arraycopy(data, 0, arr, 0, size);
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        CustomGenArrayList<Character> list = new CustomGenArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((char) ('a' + i));
        }
        System.out.println(list);
        System.out.println(list.size());
        list.set(0, 'z');
        System.out.println(list);
    }
}
