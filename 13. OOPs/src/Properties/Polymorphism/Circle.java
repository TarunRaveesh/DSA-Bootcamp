package Properties.Polymorphism;

public class Circle extends Shapes{

    // This will run when object of circle is created
    // Hence, it is overriding the parent method
    @Override // Annotation, to check if the given method is actually being overridden
    void area() {
        System.out.println("pi * r * r");
    }
}
