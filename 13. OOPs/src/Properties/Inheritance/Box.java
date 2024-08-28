package Properties.Inheritance;

//public final class Box {}
// A final class cannot be inherited, also if class is final all it's methods will also be final.

public class Box {
    // Object of Parent class cannot inherit child class properties
    int l; // A private
    int b;
    int h;
//  int w; // If same variable exists in both parent and child, then we can use 'super.w'
           // in the child class to call the parent class variable

    public static void greeting() {
        System.out.println("Hey! I'm from Box Class");
    }

    public Box() { // This class doesn't inherit any class hence super keyword which works in a linear fashion
        super(); // will call the java Object class, default for every java class
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
