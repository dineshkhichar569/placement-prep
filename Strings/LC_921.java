import java.util.Stack;

public class LC_921 {
    public static int valid(String s){
        int open = 0;
        int close = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            } else if(ch == ')' && open > 0){
                open--;
            } else {
                close++;
            }
        }

        return open + close;
    }

    ///////////////////////////////  Using Stack  ////////////////////////////////////////////
    ///////////////////////////////  Using Stack  ////////////////////////////////////////////
    ///////////////////////////////  Using Stack  ////////////////////////////////////////////

    public static int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            } else {
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        // String s = "())";
        String s = ")((((";

        System.out.println(valid(s));
        
        System.out.println(minAddToMakeValid(s));
    }
}
