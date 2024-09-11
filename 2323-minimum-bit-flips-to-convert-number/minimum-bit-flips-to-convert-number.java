class Solution {
    public int minBitFlips(int start, int goal) {
        String s = Integer.toBinaryString(start);
        String g = Integer.toBinaryString(goal);
        int sLen = s.length();
        int gLen = g.length();
        int d=0;
        if(sLen != gLen){
            d = Math.abs(sLen-gLen);
            String temp = "";
            for(int i=0;i<d;i++) temp +="0";
            if(sLen>gLen) g=temp+g;
            else s=temp+s;
        }
        sLen = s.length();
        d=0;
        for(int i=0;i<sLen;i++)
        if(s.charAt(i)!=g.charAt(i)) d++;
        return d;
    }
}