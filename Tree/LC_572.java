package Tree;

public class LC_572 {
     private static boolean isSameTree(_TreeNode root, _TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;

        if(root.value != subRoot.value) return false;

        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }

    public static boolean isSubtree(_TreeNode root, _TreeNode subRoot) {
        if(root == null || subRoot == null) return false;

        if(isSameTree(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

        public static void main(String[] args) {
        _Binary_tree_root tree1 = new _Binary_tree_root();
        _Binary_tree_root tree2 = new _Binary_tree_root();

        Integer[] nodes1 = { 3,4,5,1,2,null,null,null,null,0 };
        tree1.buildFromArray(nodes1);
        Integer[] nodes2 = { 4,1,2 };
        tree2.buildFromArray(nodes2);

        System.out.println("\nTree:");
        tree1.display();
        System.out.println("\nSub Root:");
        tree2.display();

        Boolean ans = isSubtree(tree1.getRoot(), tree2.getRoot());

        System.out.println("\nOutput = " + ans);
    }
}
