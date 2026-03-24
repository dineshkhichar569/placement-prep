package Math_Questions;

public class LC_264 {

    // /////////////////////////  it is brute force but it will give TLE  /////////////////////
    public static int nthUglyNumber(int n) {
        int num = 0;
        int count = 0;

        while (count < n) {
            num++;
            if (isUgly(num) == true) {
                count++;
            }
        }

        return num;
    }
    private static boolean isUgly(int num) {
        if (num <= 0)
            return false;

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }

    // //////////////////////// optimized version ///////////////////////
    public static int nthUglyNumber2(int n) {
        int[] num = new int[n];
        num[0] = 1;
        int ugly;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < n; i++) {
            num[i] = Math.min(Math.min(num[i2] * 2, num[i3] * 3), num[i5] * 5);
            ugly = num[i];

            if (ugly == num[i2] * 2)
                i2++;
            if (ugly == num[i3] * 3)
                i3++;
            if (ugly == num[i5] * 5)
                i5++;
        }
        return num[n - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
}
