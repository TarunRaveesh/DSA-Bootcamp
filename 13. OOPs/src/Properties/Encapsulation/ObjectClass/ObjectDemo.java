package Properties.Encapsulation.ObjectClass;

public class ObjectDemo {

    public ObjectDemo() {
        super();
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
        ObjectDemo obj = new ObjectDemo();
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj));
        System.out.println(obj.clone());
//        System.out.println(obj.finalize());
    }
}
