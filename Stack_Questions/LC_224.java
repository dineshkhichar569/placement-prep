import java.util.Stack;

public class LC_224 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int curr = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                curr = curr * 10 + (ch - '0');
            }

            if (ch == '+') {
                result += curr * sign;
                sign = 1;
                curr = 0;
            }
            if (ch == '-') {
                result += curr * sign;
                sign = -1;
                curr = 0;
            }
            if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
                curr = 0;
            }
            if (ch == ')') {
                result += curr * sign;
                curr = 0;

                result *= stack.pop(); // multiply with sign
                result += stack.pop(); // add the result before the () brackets
            }
        }

        result += sign * curr;

        return result;
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}
