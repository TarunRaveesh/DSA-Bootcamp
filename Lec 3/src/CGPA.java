import java.util.Scanner;

public class CGPA {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        System.out.print("English");
        System.out.print("Hindi");
        System.out.print("Maths");
        System.out.print("Science");
        System.out.print("SSC");
        System.out.print("English");
        double English = in.nextDouble(), Hindi = in.nextDouble(), Maths = in.nextDouble(), Science = in.nextDouble(), SSC = in.nextDouble();
        double CGPA = (English + Hindi + Maths + Science + SSC) / 5, CGPAper = 9.5 * CGPA;
        System.out.println("CGPA:" + CGPA);
        System.out.println("CGPA Percentage: " + CGPAper);
    }
}
