package Array_Questions;

import java.util.Arrays;

public class LC_1502 {

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int difference = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != difference) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};

        System.out.println(canMakeArithmeticProgression(arr));
    }
}
