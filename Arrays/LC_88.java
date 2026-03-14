package Arrays;

import java.util.Arrays;

public class LC_88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[m + n];

        while (i != m && j != n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i != m) {
            ans[k++] = nums1[i++];
        }
        while (j != n) {
            ans[k++] = nums2[j++];
        }

        for (int l = 0; l < m + n; l++) {
            nums1[l] = ans[l];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(merge(arr1, 3, arr2, 3)));
    }
}
