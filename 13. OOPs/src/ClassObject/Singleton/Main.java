package ClassObject.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(); // We can't call the constructor, hence can't make objects with 'new ClassObject.Singleton();'.
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        // obj1, obj2 and obj 3 are all pointing to the same object
    }
}
