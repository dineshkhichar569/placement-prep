package Tree;

public class LC_2415 {
    public static void helper(_TreeNode leftNode, _TreeNode rightNode, int levels) {
        if (leftNode == null || rightNode == null) {
            return;
        }

        if ((levels & 1) == 1) {
            int temp = leftNode.value;
            leftNode.value = rightNode.value;
            rightNode.value = temp;
        }

        helper(leftNode.left, rightNode.right, levels + 1);
        helper(leftNode.right, rightNode.left, levels + 1);
    }

    public static _TreeNode reverseOddLevels(_TreeNode root) {
        helper(root.left, root.right, 1);

        return root;
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 4, 2, 7, 1, 3, 6, 9 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        reverseOddLevels(tree.getRoot());

        System.out.println("\nInverted Tree:");
        tree.display();
    }
}
