package Easy;

public class FirstOccurance {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if(haystack.length() < needle.length()) return index;

        for(int i=0;i<haystack.length();i++){
            if(haystack.startsWith(needle, i)){
                index = i;
                break;
            }else if(i+needle.length()<haystack.length()){
                break;
            }
        }
        return index;
    }
}

