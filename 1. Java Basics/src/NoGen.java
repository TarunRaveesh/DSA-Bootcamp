import java.util.Random;
public class NoGen {
    public static void main(String[] args) {
        Random rn = new Random();
        int min = 0;
        int max = 4;

        for (int i = 0; i < 20; i++) {
            int no = rn.nextInt((max - min) + 1) + min;
            System.out.print(no + " ");
        }
    }
}
