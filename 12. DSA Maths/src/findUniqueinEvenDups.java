public class findUniqueinEvenDups {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 6, 3, 4, 5};
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        System.out.println(unique);
    }
}
