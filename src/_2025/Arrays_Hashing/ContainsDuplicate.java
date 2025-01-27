package _2025.Arrays_Hashing;

import java.util.HashSet;

public class ContainsDuplicate {

    private boolean hasDuplicate(int[] nums){
        int originalLength = nums.length;
        HashSet<Integer> uniqueElement = new HashSet<>();
        for( int num : nums) uniqueElement.add(num);
        return uniqueElement.size() != originalLength;
    }

    public void run(String[] args) {
       int[] nums = new int[]{1,2,3,5};
       System.out.println(this.hasDuplicate(nums));
    }
}


