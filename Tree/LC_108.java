package Tree;

public class LC_108 {
    private static _TreeNode bst(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start + (end - start)/2;

        _TreeNode node = new _TreeNode(arr[mid]);

        node.left = bst(arr, start, mid - 1);
        node.right = bst(arr, mid + 1, end);

        return node;
    }
    public static _TreeNode sortedArrayToBST(int[] arr){
        if(arr.length == 0){
            return null;
        }

        return bst(arr, 0, arr.length-1);
    }


    public static _TreeNode bst2(int[] arr, int start, int end){
        if(start > end) {
            return null;
        }
        int mid = start + (end - start)/2;

        _TreeNode node = new _TreeNode(arr[mid]);

        node.left = bst2(arr, start, mid - 1);
        node.right = bst2(arr, mid + 1, end);

        return node;
    }
    public static _TreeNode sortedArrayToBST2(int[] arr) {
        if(arr.length == 0){
            return null;
        }

        return bst2(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(sortedArrayToBST2(arr));
    }
}
