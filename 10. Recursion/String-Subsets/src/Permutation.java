import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s = "abc";
        perm("", s);
        System.out.println();
        System.out.println(permAL("", s));
        System.out.println(permCount("", s));
    }

    static void perm(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            perm(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permAL(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permAL(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += permCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}


