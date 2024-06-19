package Questions;

import java.util.Scanner;

class Vehicles {
    public static void main(String[] args) {
        // TW + FW = v
        // Total Wheels = w
        // w = TW + 4FW
        // w = 2FW + 2v
        // w/2 - v = FW
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        sc.close();

        int FW = w / 2 - v;
        int TW = v - FW;

        System.out.println("Two Wheeler: " + TW);
        System.out.println("Four Wheeler: " + FW);
    }
}