package Easy;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {

        for (int i = 0; i < 32; i++) {
            if (Math.pow(4, i) == n) {
                return true;
            }
        }
        return false;

    }
}
