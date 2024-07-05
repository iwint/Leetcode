package Zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetDuplicates {
    public void getDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() != 1){
                list.add(entry.getKey());
                System.out.print(entry.getKey()+ " ");
            }
        }

        if(list.isEmpty()){
            System.out.println(-1);
        }

    }
}
