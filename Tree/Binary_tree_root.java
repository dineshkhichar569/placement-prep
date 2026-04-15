package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_tree_root {

    public Binary_tree_root(){}

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    // old manual input method
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new TreeNode(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, TreeNode node){
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left of : " + node.value);
            int value = sc.nextInt();
            node.left = new TreeNode(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of : " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right of : " + node.value);
            int value = sc.nextInt();
            node.right = new TreeNode(value);
            populate(sc, node.right);
        }
    }

    // new method for LeetCode-style level order input
    public void buildFromArray(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            root = null;
            return;
        }

        root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(TreeNode node, String indent){
        if(node == null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}

