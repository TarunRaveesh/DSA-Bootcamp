import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

        // Initialisation
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
        }
        // Declaration
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list.get(i).add(in.nextInt());
            }
            System.out.println();
        }

        System.out.println(list);
    }
}
