import java.util.Scanner;

public class Py_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a triplet: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        Pyt(a, b, c);
    }

    private static void Pyt(int a, int b, int c) {
        if (a * a + b * b == c * c ||
                b * b + c * c == a * a)
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not Pythagorean Triplets");
    }
}
