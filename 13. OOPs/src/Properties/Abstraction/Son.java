package Properties.Abstraction;

public class Son extends Parent{ // Abstract classes must be extended (Inherited) in order to be overridden.
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    void career(String name, String career) {
        System.out.println(name + " wants to be an " + career);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("He loves" + name + ". She is " + age + ".");
    }
}
