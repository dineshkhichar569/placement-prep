package Array_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LC_989 {
    public static List<Integer> addToArrayForm(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        int i = arr.length-1;
        int carry = 0;
        while(k > 0 && i >= 0){
            int rem = k % 10;
            int sum = rem + arr[i] + carry;

            carry = sum / 10;
            list.add(sum % 10);
            i--;
            k /= 10;
        }
        while(k > 0){
            int rem = k % 10;
            int sum = rem + carry;

            carry = sum / 10;
            list.add(sum % 10);
            k /= 10;
        }
        while(i >= 0){
            int sum = arr[i] + carry;
            carry = sum / 10;
            list.add(sum % 10);
            i--;
        }

        if(carry != 0){
            list.add(carry);
        }

        Collections.reverse(list);
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
            int k = 34;
            System.out.println(addToArrayForm(arr, k));
        }
}