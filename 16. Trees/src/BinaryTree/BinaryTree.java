package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    void populate(Scanner sc) {
        System.out.println("Insert Root Node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        // Insert Left
        System.out.println("Do u want to insert Left of " + node.value + "? (true/false)");
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Insert Left of " + node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        // Insert Right
        System.out.println("Do u want to insert Right of " + node.value + "? (true/false)");
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Insert Right of " + node.value);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    void display(Node node, String indent) {
        if(node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if(level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}
