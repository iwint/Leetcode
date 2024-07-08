package Zoho;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public String getMostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
        String[] words = paragraph.split(" ");

        for (String word : words) {
            if (!Arrays.asList(banned).contains(word)&& !word.isEmpty()) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        int max = Collections.max(map.values());
        Map.Entry<String,Integer> maxSet = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                maxSet = entry;
            }

        }
        return maxSet.getKey();

    }
}
