package _2026.TwoPointers;

public class RemoveOccurrences {

    private final int element;
    private final int[] nums;

    public RemoveOccurrences(int[] nums, int element){
        this.element = element;
        this.nums = nums;
    }

    public int getUniqueElementsCount(){
        int write = 0;

        for(int read = 0; read < nums.length; read++){
            if(nums[read] != element){
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }

}
