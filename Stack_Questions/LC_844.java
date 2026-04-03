package Stack_Questions;

import java.util.Stack;

public class LC_844 {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for(char i : s.toCharArray()){
            if(i == '#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            } else {
                s1.push(i);
            }
        }
        for(char i : t.toCharArray()){
            if(i == '#'){
                if(!t1.isEmpty()){
                    t1.pop();
                }
            } else{
                t1.push(i);
            }
        }

        return s1.equals(t1);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ac#c";

        System.out.println(backspaceCompare(s, t));
    }
}
