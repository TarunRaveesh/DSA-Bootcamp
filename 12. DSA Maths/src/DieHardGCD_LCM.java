public class DieHardGCD_LCM {
    public static void main(String[] args) {
        int a = 18, b =12;
        System.out.println("HCF: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b); // Euclidean Algorithm
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
