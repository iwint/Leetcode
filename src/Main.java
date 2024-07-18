import Easy.*;
import Medium.PowerOfN;
import Medium.ReverseInteger;
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
        getDuplicates.getDuplicates(new int[]{0, 3, 1, 2, 2});

        System.out.println();

        SingleNumerII singleNumerII = new SingleNumerII();
        System.out.println(singleNumerII.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));

        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        System.out.println(secondLargestNumber.getSecondLargestNumber(new int[]{1, 2, 3}));

        MaximumProduct maximumProduct = new MaximumProduct();
        System.out.println(maximumProduct.maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));

        NearbyDuplicate nearbyDuplicate = new NearbyDuplicate();
        System.out.println(nearbyDuplicate.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));

        MostCommonWord mostCommonWord = new MostCommonWord();
        System.out.println(mostCommonWord.getMostCommonWord("Bob. hIt, baLl", new String[]{"bob","hit"}));

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean res = powerOfTwo.isPowerOfTwo(6);
        System.out.println(res);

        MinimumNumberOfMovesToConvertString minimumNumberOfMovesToConvertString = new MinimumNumberOfMovesToConvertString();
        System.out.println(minimumNumberOfMovesToConvertString.minimumMoves("XXX"));

        PowerOfN powerOfN = new PowerOfN();
        System.out.println(powerOfN.myPow(10,2));

        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{1}));

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(new char[]{'h','e','l','l','o'});

        PowerOfFour powerOfFour = new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(5));

        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-123));

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

    }
}
