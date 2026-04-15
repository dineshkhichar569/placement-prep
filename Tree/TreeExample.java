package Tree;

import java.util.Scanner;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
    }
}

public class TreeExample {
    static Scanner sc = new Scanner(System.in);

    static TreeNode buildTree(){
        System.out.println("Enter the Data of Node");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }

        TreeNode node = new TreeNode(data);
        System.out.println(data + ": Create Left Node");
        node.left = buildTree();
        System.out.println(data + ": Create right Node");
        node.right = buildTree();

        return node;
    }

    static void print(TreeNode root){
        if(root == null){
            return;
        }
        print(root.left);
        print(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        print(root);
        sc.close();
    }
}
