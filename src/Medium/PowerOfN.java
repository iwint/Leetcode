package Medium;

public class PowerOfN {
    public double myPow(double x, int n) {

        double res = 1;

        if (Integer.toString(n).length() > 4 || n < 0) {
            return Math.pow(x, n);
        }

        for (int i = 0; i < n; i++) {
            res = res * x;
        }

        return res;
    }
}
