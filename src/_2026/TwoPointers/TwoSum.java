package _2026.TwoPointers;

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

}
