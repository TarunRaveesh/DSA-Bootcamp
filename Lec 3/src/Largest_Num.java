import java.util.Scanner;

public class Largest_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else if (n > temp){
                temp = n;
            }
        }
        System.out.println("Largest No. = " + temp);
    }
}
