package Questions;

import java.util.ArrayList;
import java.util.Collections;

public class ExcelColumn {
    public static void main(String[] args) {
        int n = 5473578;
        StringBuilder col = new StringBuilder();
        while (n > 0) {
            n--;
            int r = n % 26;
            n /= 26;
            col.append((char) ('A' + r));
        }
        col.reverse();
        System.out.println(col);
    }
}
