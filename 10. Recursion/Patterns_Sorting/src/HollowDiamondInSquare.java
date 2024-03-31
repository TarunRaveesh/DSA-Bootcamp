public class HollowDiamondInSquare {
    public static void main(String[] args) {
        int size = 5; // Change the size as needed
        printPattern(size);
    }

    public static void printPattern(int size) {
        int totalRows = size * 2 - 1;
        int totalCols = size * 2 - 1;

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                if (isDiamondBorder(i, j, size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isDiamondBorder(int i, int j, int size) {
        int diamondCenter = size - 1;
        int diamondLeft = diamondCenter - i;
        int diamondRight = diamondCenter + i;

        return (j == diamondLeft || j == diamondRight || i == diamondCenter || i == (size * 2 - 2 - diamondCenter));
    }
}
