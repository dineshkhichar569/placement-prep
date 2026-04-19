package Tree;

public class LC_226 {
    public static _TreeNode invertTree(_TreeNode root) {
        if (root == null) {
            return root;
        }

        _TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();

        Integer[] nodes = { 4,2,7,1,3,6,9 };
        tree.buildFromArray(nodes);

        System.out.println("\nTree:");
        tree.display();

        invertTree(tree.getRoot());

        System.out.println("\nInverted Tree:");
        tree.display();
    }
}
