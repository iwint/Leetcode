import Easy.FirstOccurance;
import Easy.ValidAnagram;

public class Main {
    public static void main(String[] args) {
        FirstOccurance firstOccurance = new FirstOccurance();
        int index = firstOccurance.strStr("sadbutsad","sad");
        System.out.println(index);


        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat","car"));
    }
}
