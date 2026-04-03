package Stack_Questions;

import java.util.Stack;

public class LC_1598 {

    public static  int minOperations(String[] logs) {
        Stack<Integer> s = new Stack<>();

        for (String i : logs) {
            if (i.equals("../") && !s.isEmpty()) {
                s.pop();
            } else if (i.equals("./")) {
                continue;
            } else if(!i.equals("../")) {
                s.push(1);
            }
        }

        return s.size();
    }

    public static void main(String[] args) {
        String[] arr = {"./","./","./"};
        System.out.println(minOperations(arr)); 
    }
}
