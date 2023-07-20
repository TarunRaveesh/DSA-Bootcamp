public class Qn10_Panagram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    static boolean checkIfPangram(String sentence) {
        int[] arr = new int [26];
        for(int x : sentence.toCharArray()) {
            arr[x - 'a']++; // ++ => adds 1 to arr at the position of the retrieved alphabet
        }

        for(int y : arr) {
            if (y < 1) {
                return false;
            }
        }
        return true;
    }
}
