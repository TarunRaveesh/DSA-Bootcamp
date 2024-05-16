public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");
        LL list = new LL();
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

        System.out.println("Doubly Linked List");
        DLL dll = new DLL();
        dll.addStart(3);
        dll.addStart(5);
        dll.addStart(7);
        dll.addStart(9);

        dll.addEnd(12);
        dll.add(14, 7);
        dll.add(14, 12);

        dll.display();
        System.out.println(dll.length());
    }
}
