import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(2);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // Here the normal list[index] syntax will not work as in normal arrays
        }

    }
}
