package Array_Questions;

import java.util.Arrays;

public class LC_396 {
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];

        int F = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int r = 0; r < n; r++) {
                arr[(r + k) % n] = nums[r];
            }

            System.out.println(Arrays.toString(arr));

            int f = 0;
            for (int j = 0; j < n; j++) {
                f += (j * arr[j]);
            }

            System.out.println(f);

            F = (F > f) ? F : f;

        }

        return F;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 6 };

        System.out.println(maxRotateFunction(nums));
    }
}
