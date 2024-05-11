class Solution {
    int getNumeric(String a){
        int num = 0;
        for(char k:a.toCharArray())
            num = num*10 + (k-'a');
            
        return num;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f= getNumeric(firstWord);
        int s = getNumeric(secondWord);
        int t = getNumeric(targetWord);
        return f+s == t;
    }
}