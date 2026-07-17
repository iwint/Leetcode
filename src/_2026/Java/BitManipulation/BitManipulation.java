package _2026.Java.BitManipulation;

public class BitManipulation {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();

    }

    public int getValueByBinary(String binary) {

        int value = 0;

        for (int i = 0; i < binary.length(); i++) {
            value = value * 2 + binary.charAt(i) - '0';
        }

        return value;

    }

    ;
}
