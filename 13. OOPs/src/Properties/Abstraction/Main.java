package Properties.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("Rahul", 21);
        Daughter dot = new Daughter("Riya", 5);
        //We can also do it like this:
        Parent son2 = new Son("Abhay", 15); // Can call using parent, Upcasting,
        // Object will determine how methods will be overridden.

        // Parent mom = new Parent(); // Can't create objects of abstract classes
        Parent.greet(); // Can have static methods, but abstract class can't be static, else can;t be overridden
        son.acknowledge("Rahul"); // Can also have normal methods (Should be called using Objects
        son.career("Rahul", "Entrepreneur");

        dot.acknowledge("Riya");
        dot.career("Riya", "Army Officer");
    }
}
