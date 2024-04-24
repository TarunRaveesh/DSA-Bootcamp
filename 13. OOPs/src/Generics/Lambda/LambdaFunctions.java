package Generics.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.print(item * 2 + " "));
        Consumer<Integer> fun = (item) -> System.out.print(item * 2 + " ");
        arr.forEach(fun);
        System.out.println();
    }
}