package Easy;


import java.util.Arrays;

public class ReverseVowels {

    static boolean isVowel(char ch) {

        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        return Arrays.binarySearch(vowels,Character.toLowerCase(ch)) > -1;

    }


    public String reverseVowels(String s) {

        char[] existing = new char[s.length()];
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                builder.append(ch);
            }
        }

        int length = builder.length() - 1;

        for (int i = 0; i < existing.length; i++) {
            if (isVowel(s.charAt(i))) {
                char character = builder.toString().toCharArray()[length--];
                existing[i] = character;
            } else {
                existing[i] = s.charAt(i);
            }
        }

        return new String(existing);


    }

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(new ReverseVowels().reverseVowels(str));

    }
}
