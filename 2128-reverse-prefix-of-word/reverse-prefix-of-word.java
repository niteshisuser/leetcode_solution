class Solution {
    String rev(String word,int end){
        char w[] = word.toCharArray();
        int start = 0;
        while(start<=end){
            char t=w[start];
            w[start] = w[end];
            w[end] = t;
            start++;
            end--;            
        }
        return new String(w);
    }
    public String reversePrefix(String word, char ch) {
        int end = 0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch) {
                end=i;
                break;
            }
        }
        return rev(word,end);
    }
}