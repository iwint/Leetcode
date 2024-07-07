import Easy.*;
import Others.SecondLargestNumber;
import Zoho.*;

public class Main {
    public static void main(String[] args) {

        FirstOccurance firstOccurance = new FirstOccurance();
        int index = firstOccurance.strStr("sadbutsad", "sad");
        System.out.println(index);


        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("rat", "car"));

        MajorityElement majorityElement = new MajorityElement();
        System.out.println(majorityElement.majorityElement(new int[]{3, 2, 3}));

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));

        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(7));

        IsomorphicString isomorphicString = new IsomorphicString();
        System.out.println(isomorphicString.isIsomorphic("foo", "bar"));
        System.out.println(isomorphicString.isIsomorphic("paper", "title"));

        AddDigit addDigit = new AddDigit();
        System.out.println(addDigit.addDigits(1239));

        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.dramDiamond(10);

        DistinctDigits distinctDigits = new DistinctDigits();
        distinctDigits.getDistinctDigits(new int[]{111, 222, 333, 4444, 666});
        System.out.println();
        GetDuplicates getDuplicates = new GetDuplicates();
        getDuplicates.getDuplicates(new int[]{0,3,1,2,2});

        System.out.println();

        SingleNumerII singleNumerII = new SingleNumerII();
        System.out.println(singleNumerII.singleNumber(new int[]{0,1,0,1,0,1,99}));

        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        System.out.println(secondLargestNumber.getSecondLargestNumber(new int[]{1,2,3}));

        MaximumProduct maximumProduct = new MaximumProduct();
        System.out.println(maximumProduct.maximumProduct(new int[]{-100,-98,-1,2,3,4}));

        NearbyDuplicate nearbyDuplicate = new NearbyDuplicate();
        System.out.println(nearbyDuplicate.containsNearbyDuplicate(new int[]{1,0,1,1},1));

    }
}
