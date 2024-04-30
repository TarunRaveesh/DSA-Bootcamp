import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,34,667,5,4,56,667,5);
        multiple(4, 5, "Tarun", "Kunal");
    }

    static void multiple(int a, int b, String ...v) { // var length inputs must always be taken at the end
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
