public class FindUniqueModulo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 3, 2, 7, 7, 8, 7, 8, 8};
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int result = 0;
        for (int i = 1; i <= 8; i++) { // Assuming integers are 8-bit - we can change this if the numbers are larger in the array
            int count = 0;
            int mask = (1 << i);
            for (int num : arr) {
                if ((num & mask) != 0) {
                    count++;
                }
            }
            if (count % 3 != 0) {
                result |= mask; // Set the bit in result
            }
        }
        return result;
    }
}