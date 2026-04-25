package Array_Questions;

public class LC_3909 {
    public static int compareBitonicSums(int[] nums) {

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] < nums[i]) {
                index = i;
            }
        }

        long leftSum = 0;
        for (int i = 0; i <= index; i++) {
            leftSum += nums[i];
        }

        long rightSum = 0;
        for (int i = index; i < nums.length; i++) {
            rightSum += nums[i];
        }

        if (leftSum > rightSum) {
            return 0;
        } else if (leftSum < rightSum) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,1};
        System.out.println(compareBitonicSums(arr));
    }
}
