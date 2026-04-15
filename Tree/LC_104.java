package Tree;

public class LC_104 {
    public static int maxDepth(_TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 3, 9, 20, null, null, 15, 7 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        int ans = maxDepth(tree.getRoot());

        System.out.println("\nMax Depth = " + ans);
    }
}
