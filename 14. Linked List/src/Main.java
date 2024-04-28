public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addStart(3);
        list.addStart(5);
        list.addStart(7);
        list.addStart(9);
        list.addEnd(12);
        list.addStart(1);

        list.add(4, 3);
        list.add(17, 0);

        list.display();
        System.out.println(list.length());

        System.out.println(list.removeStart());
        list.display();

        System.out.println(list.removeEnd());
        list.display();

        System.out.println(list.remove(2));
        list.display();

        System.out.println(list.remove(0));
        list.display();

        System.out.println(list.remove(list.length() - 1));
        list.display();
    }
}
