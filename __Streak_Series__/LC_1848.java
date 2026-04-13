package __Streak_Series__;

public class LC_1848 {
    public static int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int abstractValue = Math.abs(i - start);
                ans = Math.min(ans, abstractValue);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;

        System.out.println(getMinDistance(nums, target, start));
    }
}
