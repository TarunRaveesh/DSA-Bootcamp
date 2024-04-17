package Inheritance;

public class Box {
    int l;
    int w;
    int h;

    public Box() {
        l = -1;
        w = -1;
        h = -1;
    }

    public Box(int side) {
        l = side;
        w = side;
        h = side;
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
