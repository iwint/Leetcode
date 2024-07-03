package Easy;

import java.util.HashMap;

public class IsomorphicString {


    public HashMap<Character, Integer> getCharMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }


    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            } else if (map.containsValue(t.charAt(i)))
                return false;

            else if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }
}
