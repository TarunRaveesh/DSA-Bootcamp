package Inheritance;

public class Box { // Object of Parent class cannot inherit child class properties
    int l; // A private
    int b;
    int h;
//  int w; // If same variable exits in both parent and child, then we can use 'super.w'
           // in the child class to call the parent class variable

    public Box() {
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
