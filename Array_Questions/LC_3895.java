package Array_Questions;

public class LC_3895 {
    public static int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for(int i : nums){
            while(i != 0){
                int rem = i % 10;

                if(rem == digit){
                    count++;
                }
                i /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12,54,32,22};
        int digit = 2;

        System.out.println(countDigitOccurrences(arr, digit));
    }
}
