package Inheritance;

public class BoxWeight extends Box{ // An inherited class cannot inherit private elements of the parent class
    int w;

    public BoxWeight() {
        this.w = -1;
    }

    public BoxWeight(int l, int b, int h, int w) {
        super(l, b, h); // What's this? - Used to call parent class constructor
        // Initializes values present in parent class in the inherited class
        // Also super will call the parent class constructor hence it will also initialize a private variable from the
        // parent class while calling the constructor here, but it can't be used.
        this.w = w;
    }
}
