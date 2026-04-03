package Stack_Questions;

import java.util.Stack;

public class LC_682 {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String i : operations) {
            if (i.matches(".*\\d.*")) {
                stack.push(Integer.valueOf(i));
            } else if (i.equals("+") && !stack.isEmpty()) {
                int a = stack.pop();
                int b = stack.pop();
                int sum = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(sum);
            } else if (i.equals("D")) {
                int d = 2 * stack.peek();
                stack.push(d);
            } else if (i.equals("C") && !stack.isEmpty()) {
                stack.pop();
            }
        }

        System.out.println(stack);

        int sum = 0;
        while(!stack.isEmpty()){
            sum = sum + stack.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};

        System.out.println(calPoints(arr));
    }
}