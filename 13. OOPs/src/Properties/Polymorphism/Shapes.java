package Properties.Polymorphism;

public class Shapes {
    // Normal Overriding => Late Binding
    void area() {
        System.out.println("Shapes Class Area");
    }
//    Early Binding: using final keyword is preferred for performance, since it eliminates the overhead for
//    checking a method/function for overriding it.

//    final void area() { // Using 'final' will prevent overriding of a method by its child classes
//        System.out.println("Shapes Class Area");
//    }
}
