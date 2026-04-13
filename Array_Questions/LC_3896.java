package Array_Questions;

public class LC_3896 {
        private static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i*i <= n; i+=2){
            if(n % i == 0) return false;
        }
        
        return true;
    }
    
    public static int minOperations(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                while(!isPrime(nums[i])){
                    count++;
                    nums[i]++;
                }
            }
            
            if(i % 2 != 0 && isPrime(nums[i]) == true){
                while(isPrime(nums[i])){
                    count++;
                    nums[i]++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(minOperations(arr));
    }
}
