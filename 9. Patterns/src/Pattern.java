public class Pattern {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dist = Math.max(Math.max(Math.abs(n / 2 - i), Math.abs(n / 2 - j)), Math.max(Math.abs(n / 2 - (n - 1 - i)), Math.abs(n / 2 - (n - 1 - j))));
                System.out.print(dist + 1 + " ");
            }
            System.out.println();
        }
    }
}
