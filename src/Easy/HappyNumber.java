package Easy;

public class HappyNumber {
    public boolean isHappy(int n) {

        int result = n;

        while (result != 1 && result != 4){
            int temp = 0;
            for (int i = 0; i < Integer.toString(result).length(); i++) {
                int k = Integer.parseInt(Character.toString(Integer.toString(result).charAt(i)));
                temp = (k * k) + temp;
            }
            result = temp;

            if(result ==4){
                return false;
            }
        }


        return result == 1;

    }
}
