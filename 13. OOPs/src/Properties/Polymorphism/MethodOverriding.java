package Properties.Polymorphism;

public class MethodOverriding {
    int num;

    public MethodOverriding(int num) {
        this.num = num;
    }

    @Override // No error in annotation => Method will be overridden successfully at runtime;
    public String toString() {
        return "MethodOverriding{" +
                "num=" + num +
                '}';
    }



    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding(45);
        System.out.println(obj); // Uses java default Object Class toString Method;
    }
}
