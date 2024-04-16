package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population; // Independent of Objects

    // We can create 'static' methods as well as variables

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // this.population will also work but this is the convention
    }
}
