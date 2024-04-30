public class PrePostOP {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 8, 5};
        for (int i = 0; i < 6; i++) {
            System.out.print(i + " - ");
            for (int j = i; j < 6; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
