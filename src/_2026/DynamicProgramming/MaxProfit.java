package _2026.DynamicProgramming;

import java.util.Arrays;

public class MaxProfit {
    public int bruteForceMethod(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int calculated = prices[j] - prices[i];
                if (calculated > max) {
                    max = calculated;
                }
            }
        }

        return max;
    }

    // Tried
    public int dpMethod(int[] prices) {

        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }else{
                profit = Math.max(profit,  prices[i] - buyPrice);
            }
        }

        return profit;
    }
}
