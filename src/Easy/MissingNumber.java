package Easy;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        //Brute force

//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                return i;
//            }
//        }
//
//        return nums[nums.length - 1] + 1;

        //Optimized approach

        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int num : nums){
            actualSum+=num;
        }

        return expectedSum - actualSum;

    }
}
