package Others;

import java.util.Arrays;

public class SecondLargestNumber {
    public int getSecondLargestNumber(int[] nums) {

        if (nums.length <= 2) {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }


}
