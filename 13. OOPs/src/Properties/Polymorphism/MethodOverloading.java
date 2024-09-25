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

    /*
      Method Overloading:
      Name of the methods overloading one another must be SAME
      There are 3 Possible scenarios wrt the formal parameters of this method:
      1. Type of parameters must be different
      2. No. of Parameters must be different
      3. Sequence of parameters must be different

      Note: Method Overloading Doesn't depend upon return type alone
     */
}
