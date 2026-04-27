package Tree;

import java.util.List;

import Tree._TreeNode;

public class LC_701{
     public static _TreeNode insertIntoBST(_TreeNode root, int val) {
        if(root == null){
            return new _TreeNode(val);
        }

        if(val < root.value){
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }


        return root;
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        int val = 5;
        Integer[] nodes = { 4,2,7,1,3 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        _TreeNode ans = insertIntoBST(tree.getRoot(), val);

        System.out.println("\nOutput = " + ans);
    }
}