package Inheritance;

public class Box {
    int l;
    int b;
    int h;

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
