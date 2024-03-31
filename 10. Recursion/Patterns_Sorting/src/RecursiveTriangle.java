public class RecursiveTriangle {
    public static void main(String[] args) {
        pattern(5, 0);
        pattern2(5, 0);
    }

    static void pattern(int r, int c) {
        if(r == 0) return;
        if(r > c) {
            System.out.print("*");
            pattern(r, ++c);
        } else {
            System.out.println();
            pattern(--r, 0);
        }
    }

    static void pattern2(int r, int c) {
        if(r == 0) return;
        if(r > c) {
            pattern2(r, ++c);
            System.out.print("*");
        } else {
            pattern2(--r, 0);
            System.out.println();
        }
    }
}
