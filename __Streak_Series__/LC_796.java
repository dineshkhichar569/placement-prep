package __Streak_Series__;

public class LC_796 {
    public static boolean rotateString(String s, String goal) {
        char[] sArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();

        int n = sArray.length;

        char[] rotateArray = new char[n];

        for(int i = 0; i < n; i++) {
            int k = i;
            for(int j = 0; j < n; j++){
                rotateArray[(j + k) % n] = sArray[j];
            }

            if(Arrays.equals(goalArray, rotateArray)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}
