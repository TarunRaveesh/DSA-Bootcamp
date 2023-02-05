import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your age: ");
        int n = in.nextInt();
        isEligible(n);
    }

    static void isEligible(int n) {
        if (n >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You aren't eligible");
        }
    }
}
