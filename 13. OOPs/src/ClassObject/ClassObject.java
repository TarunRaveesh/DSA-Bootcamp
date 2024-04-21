package ClassObject;

public class ClassObject {
    public static void main(String[] args) {
        // 'new' Keyword does Dynamic Memory Allocation, i.e. instantiates the object and allots memory at runtime
        // and ClassObject.Student() is the default constructor, but we can modify its parameters and values of the instance
        // variables of the class by initializing them as local variables.

        Student Tarun = new Student(16, "Tarun Raveesh", 96.8f);
        Student Rahul = new Student(20, "Rahul Naik", 92.5f);

        // The . operator just binds the instance variables and instance methods with the reference variable;
        System.out.println(Tarun.rno);
        System.out.println(Tarun.name);
        System.out.println(Tarun.marks);

        Tarun.greeting();

        System.out.println(Rahul.rno);
        Rahul.greeting();

        Rahul.changeName("Rahul Rana");
        Rahul.greeting();

        // Constructor Overloading
        Student JohnDoe = new Student();
        Student JohnDew = new Student(12, "John Dew", 90f);

        System.out.println(JohnDoe.name);
        System.out.println(JohnDew.name);

        Student Random = new Student(Tarun);
        System.out.println(Random.rno);
        System.out.println(Random.name);
        System.out.println(Random.marks);

        Student Random2 = new Student();

        Student one = new Student();
        Student two = one;

        one.name = "New Name"; // Also updates in the object two since it is referring to the same object in the heap as one
        System.out.println(one.name);
        System.out.println(two.name);

        // 'final' Keyword - Just fixes the value for a variable, object, class, etc.
        final int fixed = 2;
        // fixed = 3; // Not possible

        final FinalCheck Pawan = new FinalCheck("Pawan Priyatham");
        Pawan.name = "New Name"; // We can do this, i.e. modify the object;
        // Pawan = new ClassObject.FinalCheck("New Name"); // But we can't do this, i.e. change the object;
    }
}

class Student {
    int rno; // Instance variables in a class are initialized to their primitive default values
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    void changeName(String name) {
        this.name = name;
    }

//    ClassObject.Student() {
//        rno = 0;
//        name = "Default";
//        marks = 00.00f;
//    }

    // 'this' Keyword allows us to generally access every object of the class
    Student (int roll, String name, float marks) {
        rno = roll; // The local variable name must be different from the instance variable name if not using this keyword like below
        this.name = name; // This is the correct conventional way though
        this.marks = marks;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student() {
        //this is how u call a constructor inside a constructor - Constructor Chaining;
        this(100, "Random 2", 100f);
    }
}

// 'final' Keyword
class FinalCheck {
    // final int num; // Won't work since a final variable always needs to be initialized, so always initialize while declaring it.
    // NOTE: Basically 'final' keyword is responsible for making its variables immutable, BUT this is only applicable for primitives,
    // as in the case of objects, even though the reference variable might remain immutable but the object it is referring to might
    // be modified.
    final int num = 10;
    String name;

    public FinalCheck(String name) {
        this.name = name;
    }

//    Garbage Collection, in Java happens automatically, but we can specify what happens when an object is being destroyed.
//    @Override
//    protected void finalize() throws Throwable{ // Deprecated
//        System.out.println("Object is Destroyed");
//    }

//    public void garbageCollection() {
//    The try-with-resource block must be inside a method
//        try (Resource resource = new Resource()) { // Resource is something of the given problem's context
//            // Use the resource
//        } catch (Exception e) {
//            // Handle any exceptions
//        }
//    }
}