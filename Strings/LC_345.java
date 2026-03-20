
public class LC_345 {

    public static String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = str.length() - 1;

        String vowels = "aeiouAEIOU";

        while (i <= j) {
            char v1 = str.charAt(i);
            char v2 = str.charAt(j);
            if (vowels.indexOf(v1) != -1 && vowels.indexOf(v2) != -1) {
                char t = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, t);
                i++;
                j--;
            } else {
                if (vowels.indexOf(v1) == -1) {
                    i++;
                }
                if (vowels.indexOf(v2) == -1) {
                    j--;
                }
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "IceCreAm";

        System.err.println(reverseVowels(s));
    }
}
