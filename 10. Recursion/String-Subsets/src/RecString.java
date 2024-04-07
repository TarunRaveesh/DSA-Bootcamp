public class RecString {
    public static void main(String[] args) {
        String a = "abappbapplechala";
        skip("", a);
        System.out.println(skip2(a));
        System.out.println(skipApple(a));
        System.out.println(skipAppNotApple(a));
    }
    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    static String skip2(String s) {
        if(s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a') {
            return skip2(s.substring(1));
        } else {
            return ch + skip2(s.substring(1));
        }
    }
    static String skipApple(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
    static String skipAppNotApple(String s) {
        if(s.isEmpty()) {
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}
