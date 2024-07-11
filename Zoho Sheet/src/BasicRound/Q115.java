package BasicRound;

public class Q115 {
    public static void main(String[] args) { // Expand String
        String s = "b3c6d15";
        System.out.println(expandString(s));
    }

    public static String expandString(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length();) {
            char ch = s.charAt(i);
            i++;
            int num = 0;

            while(i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }
            for (int j = 0; j < num; j++) {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
