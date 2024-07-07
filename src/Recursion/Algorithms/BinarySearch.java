package Recursion.Algorithms;

public class BinarySearch {


    public int result;

    public BinarySearch(int[] nums, int target) {
        this.result = this.search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {

        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        int num = nums[mid];

        if (num == target) {
            return mid;
        } else if (target > num) {
            return search(nums, target, mid + 1, right);
        } else {
            return search(nums, target, left, mid - 1);
        }

    }
}
