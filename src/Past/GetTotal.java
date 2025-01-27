package Past;

import java.util.Scanner;

public class GetTotal {

    static int getTotalIteration(int target, int[] array){

        int count = 0;

        for(int i = 0; i< array.length; i++){
            int init = 0;
            for (int j = 0; j < array.length; j++) {
                init = i + j;
                count++;
                if(init == target) return count;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int target = I.nextInt();
        int size = I.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = I.nextInt();
        }
        System.out.println(getTotalIteration(target,array));
    }
}
