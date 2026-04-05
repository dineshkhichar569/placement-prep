public class LC_3889 {
    public static int frequency(String s){
        int[] freq = new int[128];

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        int ans = 0;
        for(char ch = 'a'; ch <= 'm'; ch++){
            char mirror = (char)('z' - (ch - 'a'));
            ans = ans + Math.abs(freq[mirror] - freq[ch]);
        }

        for(char ch = '0'; ch <= '4'; ch++){
            char mirror = (char)('9' - (ch - '0'));
            ans = ans + Math.abs(freq[mirror] - freq[ch]);
        }

        return ans;
    }

    public static void main(String[] args) {
        // String s = "ab1z9";
        String s = "4m7n";

        System.out.println(frequency(s));
    }
}
