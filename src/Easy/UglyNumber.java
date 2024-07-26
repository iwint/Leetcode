package Easy;

public class UglyNumber {

    public static boolean isUgly(int n) {

        while(n > 1){

            if(n%5==0) n=n/5;
            else if(n%3==0) n=n/3;
            else if(n%2==0) n=n/2;
            else break;

        }

        return n==1;

    }

    public static void main(String[] args) {
        System.out.println(isUgly(5));
    }
}
