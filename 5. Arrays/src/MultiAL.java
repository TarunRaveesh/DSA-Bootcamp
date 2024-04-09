import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // Declaration
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
            System.out.println();
        }

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1).get(2));
    }
}
