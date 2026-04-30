class LC_3 {

    //  solved but the approach is very bad cause the runtime is very high in next method there is optimized solution
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();

        int longest = 0;
        int x = 0;
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
                i++;
            } else {
                x++;
                longest = Math.max(longest, sb.length());
                sb.setLength(0);
                i = x;
            }
        }

        longest = Math.max(longest, sb.length());

        return longest;
    }

    public static void main(String[] args) {
        String s = "pwwkew";

        System.out.println(lengthOfLongestSubstring(s));
    }
}