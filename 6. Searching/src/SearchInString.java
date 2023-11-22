public class SearchInString {
    public static void main(String[] args) {
        String str = "";
        char ch = 'a';
        System.out.println(StringSearch(str, ch));
    }

    static boolean StringSearch(String str, char ch) {
        for(char letter : str.toCharArray()) {
            if (letter == ch) {
                return true;
            }
        }
        return false;
    }
}
