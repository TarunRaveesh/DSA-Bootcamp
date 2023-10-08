import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Select an element from a specific index (for example, index 2)
        int indexToSelect = 2;
        if (indexToSelect >= 0 && indexToSelect < arrayList.size()) {
            int selectedElement = arrayList.get(indexToSelect);
            System.out.println("Element at index " + indexToSelect + ": " + selectedElement);
        } else {
            System.out.println("Invalid index. The ArrayList does not have an element at index " + indexToSelect);
        }
    }
}




