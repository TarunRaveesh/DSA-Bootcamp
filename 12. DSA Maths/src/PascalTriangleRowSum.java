import java.util.Scanner;

public class PascalTriangleRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println(1 << (row - 1));
    }
}
