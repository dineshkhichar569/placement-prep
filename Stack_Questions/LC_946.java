package Stack_Questions;

import java.util.Stack;

public class LC_946 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();

        int i = 0;
        int j = 0;

        while (i < pushed.length || j < popped.length) {
            if (!s.isEmpty() && s.peek() == popped[j]) {
                s.pop();
                j++;
            } else if (i < pushed.length) {
                s.push(pushed[i]);
                i++;
            } else {
                break;
            }
        }

        return s.size() == 0;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};

        System.out.println(validateStackSequences(pushed, popped));
    }
}
