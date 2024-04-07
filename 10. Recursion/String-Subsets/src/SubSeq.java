import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {

    static ArrayList<String> ls = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        subseq("",s);
        System.out.println();
        ls = subseq2("", s, new ArrayList<String>());
        System.out.println(ls);

        System.out.println(subseq3("", s));
    }
    static void subseq(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    static ArrayList<String> subseq2(String p, String up, ArrayList<String> list) {
        if(up.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subseq2(p + ch, up.substring(1), list);
        subseq2(p, up.substring(1), list);
        return list;
    }

    static ArrayList<String> subseq3(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseq3(p + ch, up.substring(1));
        ArrayList<String> right = subseq3(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
