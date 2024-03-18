public class Main {
    public static void main(String[] args) {
//        pattern3(5);
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
          pattern31(4);

    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= (2*n - 1); i++) {
            int k = i <= n ? i : (2*n - i);
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int k = i <= n ? i : (2*n - i);
            //Spaces
            for (int s = 0; s < n - k; s++) {
                System.out.print("  ");
            }
            for (int j = k; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= k; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int i = 1; i <= (2*n - 1); i++) {
            int k = i <= n ? i : (2*n - i);
            //Spaces
            int x = n - k;
            for (int s = 0; s < x; s++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n) {
        int N = n;
        n = 2 * n - 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int x = N - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


}
