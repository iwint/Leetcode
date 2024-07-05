package Easy;


public class AddDigit {


    public int getSumOfDigits(int num) {
        int res = 0;

        for (char n : Integer.toString(num).toCharArray()) {
            res += Integer.parseInt(Character.toString(n));
        }

        return res;


    }

    public int addDigits(int num) {

        if (Integer.toString(num).length() == 1) {
            return num;
        }

        int result = num;

        while (Integer.toString(result).length() > 1) {
            result = getSumOfDigits(result);
        }

        return result;
    }
}
