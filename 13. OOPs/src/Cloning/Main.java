package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person Tarun = new Person(21, "Tarun");
        Tarun.age = 22;

        Person Twin = new Person(Tarun);
        System.out.println(Twin.name + "'s age is " + Twin.age);
        System.out.println(Arrays.toString(Twin.arr));

        Person Twin2 = Tarun.clone();
        System.out.println(Twin2.name + "'s age is " + Twin2.age);
        System.out.println(Arrays.toString(Twin2.arr));

        Tarun.arr[0] = -1;

        System.out.println(Arrays.toString(Tarun.arr));
        System.out.println(Arrays.toString(Twin2.arr));
    }
}
