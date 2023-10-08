import java.util.Arrays;

public class Fn_Parsing_Array {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9};
        System.out.println(Arrays.toString(arr));
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Change(int[] arr) {
        arr[0] = 0;
    }
}
