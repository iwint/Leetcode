package Zoho;

import java.util.HashSet;
import java.util.Iterator;

public class DistinctDigits {
    public void getDistinctDigits(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (Integer.toString(num).length() > 1) {
                for (char n : Integer.toString(num).toCharArray()) {
                    set.add(Integer.parseInt(Character.toString(n)));
                }
            } else {
                set.add(num);
            }
        }

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }

    }
}
