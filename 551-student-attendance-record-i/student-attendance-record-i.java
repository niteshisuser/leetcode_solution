class Solution {
    public boolean checkRecord(String s) {
        if(s.contains("LLL")) return false;
        if(s.contains("AA")) return false;
        int aCount = 0;
        for(char k:s.toCharArray()) if(k=='A') aCount++;
        return aCount<2;
    }
}