package Medium;

import java.util.HashMap;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        for(Character ch : word1.toCharArray()){
            if(word2.contains(ch.toString())){
                builder.append(Character.toString(ch));
            }
        }

        System.out.println();
        return 0;
    }
}
