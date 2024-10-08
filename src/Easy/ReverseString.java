package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }
}
