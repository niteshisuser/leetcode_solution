class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String sen[] = sentence.split(" ");
        int len = sen.length;
        for(int i=0;i<len;i++)
        {
            if(sen[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}