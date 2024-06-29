import Easy.FirstOccurance;
import Easy.MajorityElement;
import Easy.ValidAnagram;

public class Main {
    public static void main(String[] args) {

        FirstOccurance firstOccurance = new FirstOccurance();
        int index = firstOccurance.strStr("sadbutsad","sad");
        System.out.println(index);


        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat","car"));

        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{3,2,3}));
    }
}
