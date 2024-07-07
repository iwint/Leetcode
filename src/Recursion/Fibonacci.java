package Recursion;

public class Fibonacci {


    public int getNthTerm(int n) {

        if (n < 2) {
            return n;
        }
        return getNthTerm(n - 1) + getNthTerm(n - 2);
    }

}
