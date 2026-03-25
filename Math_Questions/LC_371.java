public class LC_371 {
    public static int getSum(int a, int b) {
        while(b != 0){
            int sum = a ^ b;  /// sum without carry
            int carry = (a & b) << 1; // & finds carry and << shift the carry to the left

            a = sum;
            b = carry;
        }

        return a;   
    }
    public static void main(String[] args) {
        System.out.println(getSum(5, 3));
    }
}