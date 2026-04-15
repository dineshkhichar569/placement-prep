package Tree;

public class LC_111 {
    public static int minDepth(_TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if(leftDepth == 0) return 1 + rightDepth;
        if(rightDepth == 0) return 1 + leftDepth;

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 2,null,3,null,4,null,5,null,6 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        int ans = minDepth(tree.getRoot());

        System.out.println("\nMin Depth = " + ans);
    }
}
