package Questions;

import java.util.Scanner;

class Denominations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int one = 0, two = 0;
        int five = (N - 4) / 5;
        if(N - (five*5) % 2 == 0) {
            one = 2;
        }  else {
            one = 1;
        }

        two = (N - 5*five - one);

        System.out.println(one + two + five);
    }
}