package ClassObject.Singleton;
// ClassObject.Singleton is a design pattern that assures a 'single instance' (only 1 object) of a Class for the lifetime of an application.
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
}
