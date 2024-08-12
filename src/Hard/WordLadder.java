package Hard;

import java.util.ArrayList;
import java.util.List;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if(!wordList.contains(endWord)) return 0;
        int index = wordList.indexOf(endWord);
        return index;
    }

    public static void main(String[] args) {
        System.out.println(ladderLength("hit","cog",new ArrayList<>()));
    }
}
