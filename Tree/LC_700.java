package Tree;

public class LC_700 {
    public static _TreeNode searchBST(_TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.value == val) {
            return root;
        } 
        
        if (root.value > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        _Binary_tree_root tree = new _Binary_tree_root();
        
        int val = 2;
        Integer[] nodes = { 4, 2, 7, 1, 3 };
        tree.buildFromArray(nodes);
        
        System.out.println("\nTree:");
        tree.display();
        
        _TreeNode result = searchBST(tree.getRoot(), val);

        System.out.print("\nOutput = ");

        if(result == null){
            System.out.print("null");
        } else {
            System.out.print(result.value);
        }
    }
}
