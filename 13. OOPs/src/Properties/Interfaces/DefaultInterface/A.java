package Properties.Interfaces.DefaultInterface;

public interface A {
    void fun();

    // Static Interface methods should always have a body, since they cannot be inherited by a class nor be overridden.
    // Use interface name to access it.
    static void greeting() {
        System.out.println("Namaste");
    }
}
