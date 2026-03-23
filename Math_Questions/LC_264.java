package Math_Questions;

public class LC_264 {
    public static int nthUglyNumber(int n) {
        int[] num = new int[n];
        num[0] = 1;
        int ugly;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        for (int i = 1; i < n; i++) {
            num[i] = Math.min(Math.min(num[i2]*2, num[i3]*3), num[i5]*5);
            ugly = num[i];

            if(ugly == num[i2]*2) i2++;
            if(ugly == num[i3]*3) i3++;
            if(ugly == num[i5]*5) i5++;
        }
        return num[n-1];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
}
