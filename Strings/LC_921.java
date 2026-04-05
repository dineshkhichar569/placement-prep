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

    public static void main(String[] args) {
        // String s = "())";
        String s = ")((((";

        System.out.println(valid(s));
    }
}
