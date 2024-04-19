package Inheritance;

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
    }
}