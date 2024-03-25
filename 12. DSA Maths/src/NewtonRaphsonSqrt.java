public class NewtonRaphsonSqrt {
    public static void main(String[] args) { // Time: O(log(n))
        int n = 40;
        System.out.println(newton(40));
    }
    static double newton(double n) {
        double x = n;
        double root;
        while(true) {
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.1) {
                break;
            }
            x = root;
        }
        return root;
    }

}
