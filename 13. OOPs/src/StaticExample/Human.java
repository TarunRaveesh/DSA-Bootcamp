package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population; // Independent of Objects

    // If we put an instance variable as static, all the objects will have the same value of it,
    // specifically, the latest initialized value of it

    // We can create 'static' methods as well as variables
    // For eg:
    static void message() {
        System.out.println("Hello");
        // this.age, we can't use 'this' keyword in a static method obviously bcz it basically represents objects,
        // but as we know a static method has nothing to do with objects
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // this.population will also work but this is the convention
    }
}
