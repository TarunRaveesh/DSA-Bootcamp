package ClassObject.Singleton;
import Properties.Encapsulation.AccessSpecifiers.Access;

public class Subclass extends Access{ // For checking Access Specifiers

    public Subclass(int var, int num,  String name) {
        super(var, num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(3, 10, "Checking in Subclass"); // Diff Package

        // Access obj = new Subclass(10, "Tarun"); // Won't work, since Access (Parent) doesn't know what is
        // extending it, hence only the Subclass (Child) is allowed to access a 'protected' attribute.

        String s = obj.name; // Can access 'protected'
        // int n = obj.var; // Can't access 'default'.
        // int n = obj.num; //Can't access 'private'
    }
}

class SubSubclass extends Subclass { // Subclass of the Inherited Subclass can also access 'protected' member.
    public SubSubclass(int var, int num, String name) {
        super(var, num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(3, 10, "Checking in Subclass");
        String s = obj.name; // Can access 'protected'
    }
}