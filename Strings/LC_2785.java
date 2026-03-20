
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC_2785 {

    // /////////////////////////////////////////  very high runtime ////////////////////////
    public static String sortVowels2(String s) {
        String vowels = "aeiouAEIOU";

        List<Character> vowl = new ArrayList<>();

        for (char i : s.toCharArray()) {
            if (vowels.indexOf(i) != -1) {
                vowl.add(i);
            }
        }
        Collections.sort(vowl);

        String ans = "";

        int vi = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (vowels.indexOf(x) == -1) {
                ans = ans + x;
            } else if (vi < vowl.size()) {
                ans = ans + vowl.get(vi);
                vi++;
            }
        }

        return ans;
    }

    // ////////////////////////////////////   optimized solution  /////////////////////////////
    public static String sortVowels(String s) {
        char[] srr = s.toCharArray();
        ArrayList<Character> sort = new ArrayList<>();

        for(int i = 0; i < srr.length; i++){
            if("aeiouAEIOU".indexOf(srr[i]) != -1){
                sort.add(srr[i]);
                srr[i] = '@';
            }
        }

        Collections.sort(sort);

        int l = 0;
        for(int i = 0; i < srr.length; i++){
            if(l < sort.size() && srr[i] == '@'){
                srr[i] = sort.get(l);
                l++;
            }
        }

        return String.valueOf(srr);
    }

    public static void main(String[] args) {
        String s = "lEetcOde";

        System.out.println(s);

        System.out.println(sortVowels(s));
    }
}
