package ClassObject.StaticExample;

public class Main {
    public static void main(String[] args) { // The 'main' method is static bcz it is the first thing that Java runs,
        // so we must be able to run it without creating an object of the class that has the 'main method'. Hence, basically
        // a static variable or a method is a property of the class instead of the object.
        
        Human tarun = new Human(21, "Tarun", 250000, false); // No import, same package
        Human pawan = new Human(19,"Pawan", 150000, false);
        Human suhail = new Human(22, "Suhail", 200000, true);

        System.out.println(Human.population); // Can also use, obj.population, bu t this is correct convention

        // greeting(); // Can't use a non static method inside a static method see fun() example
        System.out.print("Non-Static Method inside Static Method: ");
        fun();

        //But fun2 is also non-static, and its object will be definitely created in the static main method
        // which in turn which will also be used by greeting() like below:
        System.out.print("Non-Static Method inside Non-Static Method: ");
        Main obj2 = new Main();
        obj2.fun2();
    }

    // This is not dependent on objects
    static void fun() {
        // greeting(); // Can't use it inside this static function as this method is non-static and requires an instance

        // Cannot access non-static elements without referencing their instances in a static context
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // We know that something which is not static belongs to an object
    void greeting() {
        //fun(); // This is possible, static inside non-static, not a big deal
        System.out.println("Hello World");
    }
}
