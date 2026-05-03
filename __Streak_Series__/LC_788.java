package __Streak_Series__;

public class LC_788 {
    public static int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;

            int curr = 0;
            while (x > 0) {
                int rem = x % 10;

                if (rem == 3 || rem == 4 || rem == 7) {
                    curr = 0;
                    break;
                }

                if (rem == 2 || rem == 5 || rem == 6 || rem == 9) {
                    curr = 1;
                }

                x /= 10;
            }
            count += curr;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 857;

        System.out.println(rotatedDigits(n));
    }
}
