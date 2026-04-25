package Math_Questions;

public class LC_3098 {
    public static boolean validDigit(int n, int x) {
        String s = Integer.toString(n);

        if ((s.charAt(0) - '0') == x) return false;

        for (int i = 1; i < s.length(); i++) {
            int d = s.charAt(i) - '0';

            if (d == x) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 202;
        int x = 2;

        System.out.println(validDigit(n, x));
    }
}
