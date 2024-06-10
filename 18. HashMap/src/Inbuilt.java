import java.util.HashMap;

public class Inbuilt {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tarun", 96);
        map.put("Pawan", 95);
        map.put("Kunal", 88);
        map.put("Riya", 100);
        map.put("Nikita", 100);

        System.out.println(map.getOrDefault("Pawan", 0));
        System.out.println(map.getOrDefault("Alok", 0));
        System.out.println(map.getOrDefault("Riya", 0));
        System.out.println(map.getOrDefault("Nikita", 0));
    }
}
