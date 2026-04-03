package Stack_Questions;

import java.util.Stack;

public class LC_682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String i : operations) {
            if (i.equals("+")) {
                stack.push(stack.peek() + stack.get(stack.size() - 2));
            } else if (i.equals("D")) {
                int d = 2 * stack.peek();
                stack.push(d);
            } else if (i.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(i));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};

        System.out.println(calPoints(arr));
    }
}