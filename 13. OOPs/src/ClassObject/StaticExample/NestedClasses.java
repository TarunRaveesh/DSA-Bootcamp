package ClassObject.StaticExample;

public class NestedClasses {
    // Child classes must always be static else it will be dependent on the objects of the parent class.
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        // If u directly print the object of the 'Test' class, we will get a java in-built toString() expression.
        // we can override it using annotations.

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        // We cannot instantiate the object if the above Test Class is not static.
        // This is because if non-static, the Test class will be dependent on the objects of the parent class.
        Test obj1 = new Test("Tarun");
        Test obj2 = new Test("Pawan");

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj1); // Prints implementation of toString() specified in the class rather than Java default one;
    }
}
