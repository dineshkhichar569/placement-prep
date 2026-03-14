package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC_347 {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else{
                map.put(num, 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        System.out.println(map);

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 6, 3, 1, 3, 2};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
    }
}
