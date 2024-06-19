package Questions;

class PatternIdx {
    public static void main(String[] args) {
        String str = "takeuforward";
        String pattern = "forward";

        // for (int i = 0; i < n; i++) { // Time : O(n^2)
        //     for (int j = i + 1; j < n; j++) {
        //         String match = str.substring(i, j + 1);
        //         if(match.equals(pattern)) {
        //             System.out.println("Pattern found at index: " + i);
        //         } else {
        //             continue;
        //         }
        //     }
        // }

        int n = str.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) { // Time : O(n)
            int j;
            for (j = 0; j < m; j++) {
                if(str.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if(j == m) {
                System.out.println("Pattern found at index: " + i);
            }
        }
    }
}