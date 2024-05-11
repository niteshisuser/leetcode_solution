class Solution {
    int getNumeric(String a){
        StringBuilder sb = new StringBuilder();
        for(char k:a.toCharArray()){
            sb.append(k-'a');
        }
        return Integer.parseInt(sb.toString());
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int f= getNumeric(firstWord);
        int s = getNumeric(secondWord);
        int t = getNumeric(targetWord);
        return f+s == t;
    }
}