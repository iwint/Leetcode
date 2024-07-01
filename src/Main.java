import Easy.*;

public class Main {
    public static void main(String[] args) {

        FirstOccurance firstOccurance = new FirstOccurance();
        int index = firstOccurance.strStr("sadbutsad","sad");
        System.out.println(index);


        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat","car"));

        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{3,2,3}));

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));

        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
