package Properties.Inheritance;

public class Box { // Object of Parent class cannot inherit child class properties
    int l; // A private
    int b;
    int h;
//  int w; // If same variable exits in both parent and child, then we can use 'super.w'
           // in the child class to call the parent class variable

    public Box() { // This class doesn't inherit any class hence super keyword which works in a linear fation will call the java
//        super(); // Object class, default for every java class
        l = -1;
        b = -1;
        h = -1;
    }

    public Box(int side) {
        l = side;
        b = side;
        h = side;
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
}
