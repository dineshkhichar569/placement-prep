class LC_125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);

        if(s.length() == 0) return true;

        int i = 0;
        int j = s.length()-1;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }

    public static void main(String[] args) {
        String s = "ab_a";

        System.out.println(s);

        System.out.println(isPalindrome(s));
    }
}