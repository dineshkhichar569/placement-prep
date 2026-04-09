package Stack_Questions;

import java.util.Stack;

public class LC_227 {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        s = s.replaceAll(" ", "");

        char sign = '+';
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = (ch - '0');
            }

            if (!Character.isDigit(ch) || i == s.length()-1) {                
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                sign = ch;
                num = 0;
            }
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        // String s = "3/2";
        String s = "3-2*2";
        System.out.println(calculate(s));
    }
}
