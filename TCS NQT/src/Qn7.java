import java.util.Arrays;
import java.util.Scanner;

public class Qn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int num : arr) {
            if(num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int i = 0; i < n; i++) {
            if(i < count0) {
                arr[i] = 0;
            }
            if (i >= count0 && i < count0 + count1) {
                arr[i] = 1;
            }
            if (i >= count0 + count1){
                arr[i] = 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
