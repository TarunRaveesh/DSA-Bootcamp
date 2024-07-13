package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        boxes[0] = new Box();
        boxes[1] = new Box(3);
        boxes[2] = new Box(2, 4, 5);
        boxes[3] = new Box(boxes[2]);

        for (Box box : boxes) {
            System.out.println(box.l + " " + box.b + " " + box.h);
        }

        BoxWeight inBox = new BoxWeight();
        System.out.println(inBox.h + " " + inBox.w);

        Box funBox = new BoxWeight(3, 4, 6, 7);
        // The members accessible by the funBox variable is determined by the type of the 'Reference Variable' i.e. 'Box' here,
        // and not the type of the object i.e. BoxWeight
        System.out.println(funBox.b);
        // System.out.println(funBox.w);

        // We can't have a 'child class reference variable' pointing to a 'parent class object', bcz the parent class will not
        // know the variables initialized in the child class
        // BoxWeight funBox2 = new Box(5, 6, 8); // Not Possible

        BoxPrice costBox = new BoxPrice(5, 7, 8, 10, 350);

        // Static Method Overriding
        Box.greeting();
//        Box box = new BoxWeight();
//        box.greeting(); // YOU CAN INHERIT BUT U CAN'T OVERRIDE
        BoxWeight.greeting(); // will call the same static greeting method

        // Overriding depends on object, static doesn't depend on object, so a static method can't be overridden.
    }
}

/* Overriding in object-oriented programming (OOP) depends on objects because it is a mechanism
that allows a subclass to provide a specific implementation for a method that is already defined
in its superclass. The specific implementation of the overridden method that gets executed is
determined at runtime, based on the actual object (instance) being referenced, not the type of
the reference variable. This is a key aspect of polymorphism in OOP.

Here's a detailed explanation of why overriding depends on objects:

1. Dynamic Method Dispatch
Dynamic method dispatch (also known as runtime polymorphism) is a process where the call to an overridden
method is resolved at runtime rather than compile-time. When a method is overridden, the JVM determines
which method to execute based on the actual object being referenced at runtime, not the type of the
reference variable.

2. Reference Type vs. Object Type
In Java, a reference variable can be of a superclass type, but it can point to an object of a subclass type.
The method that gets called is based on the actual type of the object, not the type of the reference
variable. */