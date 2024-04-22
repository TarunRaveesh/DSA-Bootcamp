package Properties.Encapsulation.AccessSpecifiers;

public class Subclass extends Access{
    public Subclass(int var, int num, String name) {
        super(var, num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(4, 16, "Checking in Subclass"); // Same Package
        int n = obj.var;
    }
}
