package Algorithms;

import Algorithms.Search.BinarySearch;

public class Main {
    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{1,2,3,5,10},1));

    }
}
