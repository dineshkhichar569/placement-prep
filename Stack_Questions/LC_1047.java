package Stack_Questions;

public class LC_1047 {
    // public String removeDuplicates(String s) {
    // Stack<Character> stack = new Stack<>();

    // for(char ch : s.toCharArray()){
    // if(!stack.isEmpty() && stack.peek() == ch){
    // stack.pop();
    // } else{
    // stack.push(ch);
    // }
    // }

    // StringBuilder sb = new StringBuilder();
    // while(!stack.isEmpty()){
    // sb.append(stack.pop());
    // }

    // sb.reverse();

    // return sb.toString();
    // }

    ////////////////////////////////// optimized solution
    // public String removeDuplicates(String s) {

    // StringBuilder sb = new StringBuilder();

    // for(char ch : s.toCharArray()){
    // if(sb.length() > 0 && sb.charAt(sb.length()-1) == ch){
    // sb.deleteCharAt(sb.length()-1);
    // } else{
    // sb.append(ch);
    // }
    // }

    // return sb.toString();
    // }

    ////////////////////////////////// optimized solution
    public static String removeDuplicates(String s) {

        char[] arr = new char[s.length()];
        int index = -1;
        for (char ch : s.toCharArray()) {
            if (index >= 0 && arr[index] == ch) {
                index--;
            } else {
                index++;
                arr[index] = ch;
            }
        }

        return new String(arr, 0, index + 1);
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}
