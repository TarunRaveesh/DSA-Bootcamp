public class PrePostConcept {
    public static void main(String[] args) {
        fun(10);
    }
    static void fun(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        fun(--n); // fun(n--) won't work cz it won't decrement 'n' until the function isn't executed / called once,
                  // which won't happen as we are calling the same function in a recursive way hence infinite recursion
    }
}
