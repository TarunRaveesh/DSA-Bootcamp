public class DieHardGCD_LCM {
    public static void main(String[] args) {
        int a = 18, b =12;
        System.out.println("HCF: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(a % b, a); // Euclidean Algorithm
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
