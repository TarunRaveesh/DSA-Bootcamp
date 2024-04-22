package Properties.Inheritance;

public class BoxColor extends BoxWeight{ // Hierarchical Inheritance: Box -> BoxWeight - BoxPrice
//                                                                                |
//                                                                             BoxColor

    String color;

    public BoxColor(String color) {
        super();
        this.color = color;
    }

    public BoxColor(int l, int b, int h, int w, String color) {
        super(l, b, h, w);
        this.color = color;
    }

    public BoxColor(BoxWeight old, String color) {
        super(old);
        this.color = color;
    }
}
