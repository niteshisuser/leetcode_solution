class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int i=0,j=0;
        while(i<w1 && j<w2){
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        while(i<w1)            ans.append(word1.charAt(i++));
           
        while(j<w2)            ans.append(word2.charAt(j++));
        return ans.toString();
    }
}