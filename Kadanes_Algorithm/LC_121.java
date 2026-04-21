package Kadanes_Algorithm;

public class LC_121 {

    // Approach 1 //
    public static int maxProfit_1(int[] arr) {
        int maxProfit = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int profit = arr[j] - arr[i];
                    maxProfit = profit > maxProfit ? profit : maxProfit;
                }
            }
        }
        
        if (maxProfit < 0) {
            maxProfit = 0;
        }
        
        return maxProfit;
    }
    

    // Approach 2 //
    public static int maxProfit_2(int[] arr) {
        int min = arr[0];
        int maxProfit = 0;
        
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            int profit = arr[i] - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        
        return maxProfit;
    }
    

    // Approach 3 //
    public static int maxProfit_3(int[] prices) {
        int buy = 0;
        int sell = 1;

        int maxProfit = 0;

        while (sell < prices.length) {
            if (prices[sell] > prices[buy]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = sell;
            }
            sell++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit_1(prices));
        System.out.println(maxProfit_2(prices));
        System.out.println(maxProfit_3(prices));
    }
}
