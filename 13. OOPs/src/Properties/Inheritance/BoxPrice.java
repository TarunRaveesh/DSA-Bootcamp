package Properties.Inheritance;

public class BoxPrice extends BoxWeight { // Multi level Inheritance, Box -> BoxWeight -> BoxPrice
    int cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice old) {
        super(old);
        this.cost = old.cost;
    }

    public BoxPrice(int l, int b, int h, int w, int cost) {
        super(l, b, h, w);
        this.cost = cost;
    }
}
