package Stack_Questions;

import java.util.Stack;

public class LC_20 {
    private static boolean isMatch(char open, char close) {
        return open == '(' && close == ')'
                || open == '[' && close == ']'
                || open == '{' && close == '}';
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || !isMatch(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}
