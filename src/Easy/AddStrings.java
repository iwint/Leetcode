package Easy;

public class AddStrings {
    public String addStrings(String num1, String num2) {

        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);

        return Long.toString(n1+n2);
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("6913259244","71103343"));
    }
}
