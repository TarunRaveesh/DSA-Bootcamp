public class PhonePad {
    public static void main(String[] args) {
        String s = "123";
        pad("", s);
    }

    static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int d = up.charAt(0) - '0'; //Converts '2' to 2
        for (int i = (d-1)*3; i < (d*3); i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
}
