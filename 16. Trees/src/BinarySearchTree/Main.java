package BinarySearchTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        BST bst1 = new BST();
        BST bst2 = new BST();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {10, 8, 11, 3, 14, 2, 9, 15, 5, 7, 12};

        bst1.populateSorted(arr);
        bst1.display();
        System.out.println();
        System.out.println("--------------------2nd Tree--------------------");

        bst2.populate(nums);
        bst2.display();
        System.out.println(bst2.balanced());

        while (true) {
            System.out.println("\n-----------------------Menu-----------------------");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. In-order Traversal");
            System.out.println("5. Pre-order Traversal");
            System.out.println("6. Post-order Traversal");
            System.out.println("7. Display BST");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int valueToInsert = sc.nextInt();
                    bst.insert(valueToInsert);
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                    int valueToSearch = sc.nextInt();
                    boolean found = bst.search(valueToSearch);
                    System.out.println("Value " + (found ? "found" : "not found") + " in BST.");
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = sc.nextInt();
                    bst.delete(valueToDelete);
                    break;
                case 4:
                    System.out.println("In-order Traversal:");
                    bst.inorderTraversal();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Pre-order Traversal:");
                    bst.preorderTraversal();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Post-order Traversal:");
                    bst.postorderTraversal();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Display BST");
                    bst.display();
                    System.out.println();
                case 8:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}