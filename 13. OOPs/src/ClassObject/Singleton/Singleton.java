package ClassObject.Singleton;
import Properties.Encapsulation.AccessSpecifiers.Access;
import org.w3c.dom.ls.LSOutput;

// Singleton is a design pattern that assures a 'single instance' (only 1 object) of a Class for the lifetime of an application.
public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public method to provide access to the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // ---------- For Access Specifiers ---------- //
    Access obj = new Access(2, 12, "Checking in World"); // Diff package and not Subclass.
    // String s = obj.name; // Can't access 'protected'.
    // int n = obj.var; // Can't access 'default'.
    // int n = obj.num; // Can't access 'private'.
    int m = obj.getNum(); // Can use getter and setter for both num and var
}
