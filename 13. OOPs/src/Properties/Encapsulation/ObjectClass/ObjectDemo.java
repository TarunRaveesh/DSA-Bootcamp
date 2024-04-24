package Properties.Encapsulation.ObjectClass;

import Properties.Encapsulation.AccessSpecifiers.Access;

public class ObjectDemo {
    int x;
    double y;

    public ObjectDemo(int x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    @Override
    public boolean equals(Object obj) {
        return this.x == ((ObjectDemo)obj).x; // Object Type Casting
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) throws Throwable {
        ObjectDemo obj = new ObjectDemo(4, 2.8);
        ObjectDemo obj2 = new ObjectDemo(4, 7.2);
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
//        System.out.println(obj.clone());
//        System.out.println(obj.finalize());

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj instanceof Object);
        System.out.println(obj.getClass().getName()); // Can't override getClass method(Cz final)
        // getClass() info stored in heap
    }
}
