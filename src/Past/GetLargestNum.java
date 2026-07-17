package Past;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetLargestNum {


    static  int getMaxAtN(int[] list, int n){

        Arrays.sort(list);
        return list[n];

    }


    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int size = I.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] =I.nextInt();
        }
        System.out.println("ENter nth largest term");
        int nth = I.nextInt();

        System.out.println("Result: " + getMaxAtN(list,nth));
    }

}
