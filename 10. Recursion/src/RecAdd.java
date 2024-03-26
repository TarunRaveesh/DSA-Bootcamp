public class RecAdd {
    public static void main(String[] args) {
        System.out.println(add(20));
    }
    static int add(int n) { // Sum of 1 to n
        if(n == 0) return 0;
        return n + add(n - 1);
    }
}
