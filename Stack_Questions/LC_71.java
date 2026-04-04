
import java.util.Stack;

class LC_71 {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();

        String[] arr = path.split("/");
        
        // -->  "/home//foo/"
        // -->  arr = {"", "home", "", "foo"}
        //  for ""  -->  i.length() == 0 then continue

        for(String i : arr){
            if(i.equals(".") || i.length() == 0){
                continue;
            } else if(i.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            } else {
                s.push(i);
            }
        }

        return '/' + String.join("/", s);
    }

    public static void main(String[] args) {
        String path = "/home/";

        System.out.println(simplifyPath(path));
    }

}