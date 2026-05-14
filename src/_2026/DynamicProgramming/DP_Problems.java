package _2026.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP_Problems {
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
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - buyPrice);
            }
        }

        return profit;
    }

    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] climb = new int[n + 1];

        climb[0] = 1;
        climb[1] = 1;

        for (int i = 2; i <= n; i++) {
            climb[i] = climb[i - 1] + climb[i - 2];
        }

        return climb[n];
    }

    public List<List<Integer>> generate(int numRows) {

        if (numRows <= 0) return new ArrayList<>();

        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int value = (j == 0 || j == i) ? 1 : pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                row.add(value);
            }
            pascalTriangle.add(i, row);
        }

        return pascalTriangle;
    }

    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1).get(rowIndex);
    }
}
