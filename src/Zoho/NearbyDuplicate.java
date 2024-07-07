package Zoho;

import java.util.HashMap;

public class NearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            Integer index = map.get(number);
            if(index !=null){
                if(i- index <=k){
                    return true;
                }
            }
            map.put(number,i);
        }



        return false;
    }
}
