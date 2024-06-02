class Solution {
    public int percentageLetter(String s, char letter) {
        int letterCount = 0;
        int n=s.length();
        for(char k:s.toCharArray())
            if(letter == k)
                letterCount ++;
        return Math.abs(letterCount*100/n);
    }
}