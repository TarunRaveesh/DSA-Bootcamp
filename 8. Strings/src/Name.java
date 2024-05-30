import java.util.ArrayList;

public class Name {
    public static void main(String[] args) {
        String str = "Tarun Raveesh";
        str = str.toLowerCase();
        System.out.println(str);
        ArrayList<Character> arr = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if(ch != ' ') {
                arr.add(ch);
            }
        }
        System.out.println(arr);
        oddChar(arr);
        printChar(arr);
    }

    static void oddChar(ArrayList<Character> arr) {
        System.out.print(arr.getFirst() + " ");
        for (int i = 1; i < arr.size(); i++) {
            if(i % 2 == 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
        System.out.println();
    }

    static void printChar(ArrayList<Character> arr) {
        int[] alpha = new int[26];
        for(char ch : arr) {
            int idx = ch - 'a';
            alpha[idx] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if(alpha[i] == 0) {
                continue;
            }
            System.out.println((char)(97 + i) + ": " + alpha[i] + " time(s)");
        }
    }
}
