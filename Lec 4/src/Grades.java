import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int n = in.nextInt();
        Grade(n);
    }

    static void Grade(int n) {
        if (n <= 100 && n > 90) {
            System.out.println("AA");
        } else if (n <= 90 && n > 80) {
            System.out.println("AB");
        } else if (n <= 80 && n > 70) {
            System.out.println("BB");
        } else if (n <= 70 && n > 60) {
            System.out.println("BC");
        } else if (n <= 60 && n > 50) {
            System.out.println("CD");
        } else if (n <= 50 && n > 40) {
            System.out.println("DD");
        } else if (n <= 40) {
            System.out.println("Fail");
        }
    }
}
