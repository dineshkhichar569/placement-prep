package Tree;

import java.util.Scanner;

public class BinaryTreeExample {

    public BinaryTreeExample() {
    }

    private _TreeNode root;

    public _TreeNode getRoot() {
        return root;
    }

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new _TreeNode(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, _TreeNode node) {
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left of : " + node.value);
            int value = sc.nextInt();
            node.left = new _TreeNode(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of : " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right of : " + node.value);
            int value = sc.nextInt();
            node.right = new _TreeNode(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(_TreeNode node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeExample tree = new BinaryTreeExample();
        tree.populate(sc);
        tree.display();
    }

}
