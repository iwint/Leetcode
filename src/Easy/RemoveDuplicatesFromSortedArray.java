package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i, j;
        i = 1;
        j = 1;
        int n = nums.length;
        while (j < n) {
            if (nums[i] > nums[i - 1]) {
                i++;
                j++;
            } else {
                if (nums[j] > nums[i - 1]) {
                    nums[i] = nums[j];
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
        }
        return i;
    }
}
