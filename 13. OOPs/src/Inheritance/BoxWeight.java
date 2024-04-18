package Inheritance;

public class BoxWeight extends Box{
    int w;

    public BoxWeight() {
        this.w = -1;
    }

    public BoxWeight(int l, int b, int h, int w) {
        super(l, b, h); // What's this? - Used to call parent class constructor
        // Initializes values present in parent class in the inherited class
        this.w = w;
    }
}
