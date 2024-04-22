package ClassObject.StaticExample;
// Demo to show initialization of static variables
public class StaticInit {
    static int a = 4;
    static int b;

    // Will only run once when the obj is created and the class is loaded for the first time
    static {
        System.out.println("Currently inside Static Block");
        b = 5 * a;
    }

    public static void main(String[] args) { // 'main method' can be anywhere, since it's static;
        System.out.println(StaticInit.a + " " + StaticInit.b);

        StaticInit.b += 3;
        System.out.println(StaticInit.a + " " + StaticInit.b);
    }
}

// NOTE: We know objects are created at runtime, and static elements are not dependent on objects,
// hence they are resolved at compile time, as they are class level elements.