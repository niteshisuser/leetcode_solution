class Solution {
    public boolean isAcronym(List<String> words, String s) {
        //Corner Case if word length and string length are not same,
        // s is not acronym of words
        int wLen = words.size();
        int sLen = s.length();
        if(wLen!=sLen) return false;

        for(int i=0;i<wLen;i++){
            if(s.charAt(i)!=words.get(i).charAt(0))
                return false;
        }
        return true;
    }
}