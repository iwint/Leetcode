package _2026.DynamicProgramming;

import java.util.Arrays;

public class Fibno {


    // Using bruteforce recursion function
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 2) + fib(n - 1);
    }

    //Using DP Memoization method - Rarely used method
    public int memoizedDP(int n) {
        int[] memoizedValues = new int[n + 1];

        Arrays.fill(memoizedValues, -1);
        return dpFib(n, memoizedValues);
    }

    private int dpFib(int n, int[] memo) {
        if (n <= 1) return n;

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = dpFib(n - 2, memo) + dpFib(n - 1, memo);
        return memo[n];
    }

    //Using Tabulation method - Mostly used method
    public int tabulationMethodFib(int n) {

        int[] tabulatedValues = new int[n + 1];

        tabulatedValues[0] = 0;
        tabulatedValues[1] = 1;

        for (int i = 2; i <= n; i++) {
            tabulatedValues[i] = tabulatedValues[i - 2] + tabulatedValues[i - 1];
        }

        return tabulatedValues[n];

    }

}
