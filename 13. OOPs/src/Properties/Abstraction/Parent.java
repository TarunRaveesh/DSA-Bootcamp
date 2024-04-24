package Properties.Abstraction;

public abstract class Parent { // Abstract Classes can't be final, as then we can't inherit and override.
    int age; // Can have a variable
    String name;
    final int VALUE; // Can have final & static variables. Conventionally, use all caps for final variable

    // abstract Parent() // Can't create abstract constructors
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
        VALUE = 10000;
    }

    static void greet() {
        System.out.print("Hey! ");
    }

    void acknowledge(String name) {
        System.out.println("I am the parent of " + name);
    }

    abstract void career(String name, String career);
    abstract void partner(String name, int age);
}
