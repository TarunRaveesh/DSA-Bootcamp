package ExamPrep;// Qns Link - https://prepinsta.com/tcs-nqt/placement-papers/advance/coding/

import java.util.*;
public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int[] arr = new int[f];
        for(int i = 0; i < f; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int guess : arr) {
            if(guess != arr[0]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
