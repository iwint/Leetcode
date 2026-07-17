package _2026.Java.TwoPointers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a target:\t");
        int target = scanner.nextInt();
        int[] nums = new int[]{1, 2, 5, 5, 6};

        //Two Sum
        TwoSum twoSum = new TwoSum(target, nums);
        System.out.println(twoSum.isTwoSumExist());

        //Remove Occurrences
        RemoveOccurrences removeOccurrences = new RemoveOccurrences(nums, target);
        System.out.println(removeOccurrences.getUniqueElementsCount());
    }
}
