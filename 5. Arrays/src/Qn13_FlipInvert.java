import java.util.Arrays;

public class Qn13_FlipInvert {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int row = 0; row < image.length; row++) {
            flip(image[row]);
            for (int col = 0; col < image[row].length; col++) {
                if (image[row][col] == 1) {
                    image[row][col] = 0;
                } else {
                    image[row][col] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(image));
    }

    static void flip(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
