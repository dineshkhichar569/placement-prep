package Stack_Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_150 {
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

    public static int evalRPN(String[] token) {
        Deque<Integer> s = new ArrayDeque<>();
        for (String ch : token) {
            if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
                int second = s.pop();
                int first = s.pop();
                int result = calculate(first, second, ch);
                s.push(result);
            } else {
                s.push(Integer.parseInt(ch));
            }
        }

        return s.peek();
    }

    public static void main(String[] args) {
        String[] arr = {"2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }
}
