import java.util.Scanner;

public class Euclid_Dist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Coordinates of P1(X1,Y1) = ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Coordinates of P2(X2,Y2) = ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Distance btw P1 & P2 = " + d);
    }
}