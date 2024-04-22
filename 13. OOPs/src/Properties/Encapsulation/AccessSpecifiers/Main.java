package Properties.Encapsulation.AccessSpecifiers;
public class Main {
    public static void main(String[] args) {
        Access obj = new Access(10, 24, "Tarun");

        // obj.num; Error, num is private;
        // But Needs to do:
        // 1. Access data members
        System.out.println(obj.getNum());
        // 2. Modify data members
        obj.setNum(20);
        System.out.println(obj.getNum());

        String s = obj.name; // Can access 'protected'
        int n = obj.var; // Can access 'default'.
        // int m = obj.num; // Can't access 'private' in same package.


    }
}
