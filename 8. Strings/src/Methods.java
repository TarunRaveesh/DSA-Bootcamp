import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Tarun Raveesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // Not gonna convert the original String object 'name', since we know it's immutable
        System.out.println(name);
        System.out.println(name.indexOf('r'));
        System.out.println(name.lastIndexOf('R'));
        System.out.println("    Tarun Raveesh ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.substring(0, 2));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.substring(i));
        }
        System.out.println(name.trim());
    }
}
