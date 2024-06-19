package Questions;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String sent = "My name is Tarun Raveesh";
        String[] words = sent.split(" ");
        
        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i > 1; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println(words[0]);
    }
}