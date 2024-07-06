package Easy;

import java.util.Arrays;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int m1 = nums[0] * nums[1] * nums[n - 1];
        int m2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return Math.max(m1,m2);

    }
}
