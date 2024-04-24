package Properties.Interfaces.DefaultInterface;

public interface B{ // has fun() also
    default void greet() {
        System.out.println("Hello!"); // So, default is a special use feature. Primary motivation was to expand
        // interfaces without breaking the existing code, i.e. eliminate redundancy of specifying body of the
        // methods in each class it is implemented.
    }
    // Also, don't use 'default' if u have similar named methods in different interfaces,
    // else same multiple inheritance problem.
    void fun(); // i.e. don't use 'default' for fun else error
}
