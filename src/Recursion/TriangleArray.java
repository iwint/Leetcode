package Recursion;

import java.util.Arrays;

public class TriangleArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        generateTriangle(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void generateTriangle(int[] nums) {
        int length = nums.length;

        if(length==1){
            return;
        }

        int[] result = new int[length -1];
        fillTriangleArray(result,nums,0);
        generateTriangle(result);
        System.out.println(Arrays.toString(result));

    }

    private static void fillTriangleArray(int[] result, int[] nums, int i) {

        if(i == nums.length -1){
            return;
        }
        result[i] = nums[i] + nums[i+1];
        fillTriangleArray(result,nums,i+1);

    }

}
