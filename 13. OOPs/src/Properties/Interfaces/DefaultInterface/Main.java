package Properties.Interfaces.DefaultInterface;

public class Main implements A, B { // Must implement both the methods since B extends A
    @Override // Annotations are also interfaces only (Do ctrl + click)
    public void fun() { // Also overridden methods should have same or better access specifiers than the parent.
        // i.e. if Parent method => protected then, child should be protected or public
        // (Can't be more restrictive i.e. private or default)
        System.out.println("I'm a function");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.fun();
        obj.greet(); // Default Method in B, no need for separate body.
        A.greeting();
    }
}
