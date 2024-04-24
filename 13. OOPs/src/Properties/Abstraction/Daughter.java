package Properties.Abstraction;

public class Daughter extends Parent{
    public Daughter(String name, int age) {
        super(name, age);
    }
    @Override
    void career(String name, String career) {
        System.out.println(name + " wants be an " + career);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("She loves" + name + ". He is " + age + ".");
    }
}
