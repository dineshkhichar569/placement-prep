package Stack_Questions;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LC_739 {
    public static int[] dailyTemperatures(int[] temp) {
        Deque<Integer> s = new ArrayDeque<>();
        int[] ans = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            while (!s.isEmpty()) {
                if (temp[i] <= temp[s.peek()]) {
                    break;
                }
                int prev = s.pop();
                ans[prev] = i - prev;
            }
            s.push(i);
        }

        return ans;
    }

    // public static int[] dailyTemperatures(int[] temp) {
    // Stack<Integer> s = new Stack<>();
    // int[] ans = new int[temp.length];

    // for(int i = 0; i < temp.length; i++){
    // while(!s.isEmpty() && temp[i] > temp[s.peek()]){
    // int prev = s.peek();
    // ans[prev] = i - prev;
    // s.pop();
    // }
    // s.push(i);
    // }

    // return ans;
    // }

    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
