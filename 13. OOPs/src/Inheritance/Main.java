package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box[] boxes = new Box[4];
        boxes[0] = new Box();
        boxes[1] = new Box(3);
        boxes[2] = new Box(2, 4, 5);
        boxes[3] = new Box(boxes[2]);

        for (Box box : boxes) {
            System.out.println(box.l + " " + box.w + " " + box.h);
        }


    }
}