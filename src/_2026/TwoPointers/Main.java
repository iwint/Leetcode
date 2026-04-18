package _2026.TwoPointers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a target:\t");
        int target = scanner.nextInt();
        int[] nums = new int[]{1, 2, 3, 5, 6};
        TwoSum twoSum = new TwoSum(target, nums);
        System.out.println(twoSum.isTwoSumExist());
    }
}
