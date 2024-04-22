package Properties.Polymorphism;

public class MethodOverloading {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, int b) {
        return a + b;
    }

    String sum(int a, int b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.sum(3, 5)); // 1st One - But if first one is not there then it will cast as 2nd One
        System.out.println(obj.sum(4.5, 6)); // 2nd One
        System.out.println(obj.sum(4, 5, "Tarun")); // 3rd One
    }
}
