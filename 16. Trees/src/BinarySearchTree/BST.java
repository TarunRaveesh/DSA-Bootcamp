package BinarySearchTree;

public class BST {

    // Node class representing a single node in the binary search tree
    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    int height(Node node) {
        if(node == null) {
            return 0;
        }
        return node.height;
    }

    public void populate(int[] arr) {
        for (int a : arr) {
            insert(a);
        }
    }

    // For Sorted Array (To avoid O(n) like Linked List)
    public void populateSorted(int[] arr) {
        populateSorted(arr, 0, arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end)/2;
        insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    // Method to insert a new value into the BST
    public void insert(int value) {
        root = insert(root, value);
    }

    // Recursive method to insert a new value into the BST
    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        node.height = 1 + Math.max(height(node.left), height((node.right))); // Adding 1 for the edge connecting the current node.
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // Method to search for a value in the BST
    public boolean search(int value) {
        return search(root, value);
    }

    // Recursive method to search for a value in the BST
    private boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value < node.value) {
            return search(node.left, value);
        } else if (value > node.value) {
            return search(node.right, value);
        } else {
            return true;
        }
    }

    // Method to delete a value from the BST
    public void delete(int value) {
        root = delete(root, value);
    }

    // Recursive method to delete a value from the BST
    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.value = minValue(node.right);

            // Delete the inorder successor
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    // Method to find the minimum value in a subtree
    private int minValue(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    // Method to perform in-order traversal of the BST
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    // Recursive method to perform in-order traversal of the BST
    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value + " ");
            inorderTraversal(node.right);
        }
    }

    // Method to perform pre-order traversal of the BST
    public void preorderTraversal() {
        preorderTraversal(root);
    }

    // Recursive method to perform pre-order traversal of the BST
    private void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Method to perform post-order traversal of the BST
    public void postorderTraversal() {
        postorderTraversal(root);
    }

    // Recursive method to perform post-order traversal of the BST
    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if(node == null) {
            return;
        }
        display(node.right, level + 1);
        if(level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>(" + node.value +")");
        } else {
            System.out.println("("+node.value+")");
        }
        display(node.left, level + 1);
    }
}