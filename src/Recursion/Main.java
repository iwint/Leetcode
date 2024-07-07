package Recursion;

import Recursion.Algorithms.BinarySearch;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNthTerm(7));

        Factorial factorial = new Factorial();
        int result = factorial.fact(5);
        System.out.println(result);

        int[] nums = new int[]{1, 2, 4, 5, 10};
        BinarySearch binarySearch = new BinarySearch(nums, 10);
        int searchResult = binarySearch.result;
        System.out.println(searchResult);
    }
}
