package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_438 {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int a = 0; a < k; a++) {
            arr1[p.charAt(a) - 'a']++;
        }

        int i = 0;
        int j = 0;

        while (j < s.length()) {
            if (j - i + 1 < k) {
                arr2[s.charAt(j) - 'a']++;
                j++;
            } else if (j - i + 1 == k) {
                arr2[s.charAt(j) - 'a']++;

                if (Arrays.equals(arr1, arr2) == true) {
                    list.add(i);
                }
                arr2[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
}
