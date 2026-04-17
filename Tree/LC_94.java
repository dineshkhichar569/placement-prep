package Tree;

import java.util.ArrayList;
import java.util.List;

public class LC_94 {
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> inorderTraversal(_TreeNode root) {
        if (root == null) {
            return list;
        }

        inorderTraversal(root.left);
        list.add(root.value);
        inorderTraversal(root.right);

        return list;
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        List<Integer> ans = inorderTraversal(tree.getRoot());

        System.out.println("\nOutput = " + ans);
    }
}
