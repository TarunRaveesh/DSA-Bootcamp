package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle(); // In overriding, the type of method being called from depends on type of object
        Shapes triangle = new Triangle(); // Here, the reference variable, i.e. LHS only defines which method or variable
        // will be accessed/called, so that there is a method in parent class that is to be overridden, so that the object
        // define which method will run and will override the parent class method.

        // JAVA does this using: Dynamic Method Dispatch, to carry this out at runtime.
        circle.area();
        shape.area();
        triangle.area();
    }
}
