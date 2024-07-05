package Zoho;

public class DiamondPattern {
    public void dramDiamond(int num) {

        int space = num - 1;

        for (int rows = num-1; rows > 0; rows--) {
            for (int spaces = space; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int cols = num - space; cols > 0; cols--) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }

        space = 0;

        for (int rows = 0; rows < num; rows++) {
            for (int spaces = space; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int cols = num - space; cols > 0; cols--) {
                System.out.print("* ");
            }
            space++;
            System.out.println();
        }


    }
}
