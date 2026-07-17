package _2026.Java.TwoPointers;

import java.util.HashMap;

public class TwoSum {

    private final int target;
    private final int[] nums;

    public TwoSum(int target, int[] nums) {
        this.nums = nums;
        this.target = target;
    }

    public boolean isTwoSumExist() {

        int left = 0;
        int right = this.nums.length - 1;

        while (left < right) {
            int sum = this.nums[left] + this.nums[right];

            if (sum == this.target) {
                return true;
            }

            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public int[] bruteForceTwoSum(int[] nums, int target) {

        int size = nums.length;

        for (int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] usingMapTwoSum(int[] nums, int target){


        HashMap<Integer, Integer> map = new HashMap<>();
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            int targetDifference = target - i;

            if(map.containsKey(targetDifference)){
                return new int[]{map.get(targetDifference), i};
            }

            map.put(nums[i], i);
        }


        return new int[]{-1,-1};
    };



}
