package Questions;

public class Prime {
    public static void main(String[] args) {
        int N = 40;
        boolean[] prime = new boolean[N + 1];
        for (int i = 2; i * i < N; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= N; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
