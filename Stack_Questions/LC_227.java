package Stack_Questions;

public class LC_227 {
    private static int calculate(int a, int b, String token) {
        if (token.equals("+")) {
            return a + b;
        } else if (token.equals("-")) {
            return a - b;
        } else if (token.equals("/")) {
            return a / b;
        }
        return a * b;
    }

    public static void main(String[] args) {
        // String s = "3/2";
        String s = " 3/ 2 ";
        s = s.replaceAll(" ", "");
        System.out.println(s.charAt(0) - '0');
    }
}
