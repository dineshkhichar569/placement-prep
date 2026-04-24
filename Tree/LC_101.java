package Tree;

public class LC_101 {
    private static boolean isMirror(_TreeNode left, _TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        if (left.value != right.value)return false; // this for the condition as seen below
        //    1
        //  /  \
        // 2    3

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static boolean isSymmetric(_TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        Boolean ans = isSymmetric(tree.getRoot());

        System.out.println("\nOutput = " + ans);
    }
}
