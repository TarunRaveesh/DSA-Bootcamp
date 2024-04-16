package StaticExample;

public class Main {
    public static void main(String[] args) { // The 'main' method is static bcz it is the first thing that Java runs,
        // so we must be able to run it without creating an object of the class that has the 'main method'. Hence, basically
        // a static variable or a method is a property of the class instead of the object.
        
        Human tarun = new Human(21, "Tarun", 250000, false); // No import, same package
        Human pawan = new Human(19,"Pawan", 150000, false);
        Human suhail = new Human(22, "Suhail", 200000, true);

        System.out.println(Human.population); // Can also use, obj.population, bu t this is correct convention

        // greeting(); // Can't use a non static method inside a static method
    }

    // We know that something which is not static belongs to an object
    void greeting() {
        System.out.println("Hello World");
    }
}
