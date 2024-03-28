import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {9, 14, 2, 54, 16, 9, 23, 12, 16, 2, 9, 2, 45};
        System.out.println(find(arr, 14, 0));
        System.out.println(findIndex(arr, 54, 0));
        System.out.println(findIndexLast(arr, 12, arr.length - 1));
        findAllIndex(arr, 16, 0);
        System.out.println(list);
        System.out.println(listFind(arr, 2, 0, new ArrayList<>()));
        System.out.println(listFind2(arr, 9, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        return arr[index] == target || find(arr, target, ++index);
    }
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if(arr[index] == target) return index;
        else return findIndex(arr, target, ++index);
    }
    static int findIndexLast(int[] arr, int target, int index) {
        if (index < 0) return -1;
        if(arr[index] == target) return index;
        else return findIndexLast(arr, target, --index);
    }

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) return;
        if(arr[index] == target)  list.add(index);
        findAllIndex(arr, target, ++index);
    }

    static ArrayList<Integer> listFind(int[] arr, int target, int index, ArrayList<Integer> list) {
        // Here list will be a new reference variable in each recursive call,but it will point to the same ArrayList object in the heap
        if(index == arr.length - 1) return list;
        if(arr[index] == target)  list.add(index);
        return listFind(arr, target, ++index, list); // The value of the list will be passed upwards through each function call returning the
        // value at each one of them and finding it's way to the base statement through the recursive descent parsing stack.
    }

    static ArrayList<Integer> listFind2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length - 1) return list;

        // Will contain answer just form this particular function call;
        if (arr[index] == target) list.add(index);

        // Unlike 'listFind' here a new arraylist will be created at each recursive function call and the valve will not be hence directly be
        // updated in a single list object like above, hence we need to add the value obtained by the current list in each function call.
        ArrayList<Integer> BelowCalls =  listFind2(arr, target, ++index);
        list.addAll(BelowCalls);
        return list;
    }
}
