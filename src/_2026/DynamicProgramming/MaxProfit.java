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

    public int dpTabularMethod(int[] prices) {
        int[] profits = new int[prices.length];

        profits[0] = 0;

        System.out.println(Arrays.toString(prices));

        for (int i = 0; i < prices.length - 1; i++) {
            profits[i] = prices[i+1] - prices[i];
        }

        System.out.println(Arrays.toString(profits));

        return 0;
    }
}
