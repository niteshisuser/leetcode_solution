class Solution {
    boolean isGood(String s){
        Set<Character> set = new HashSet();
        for(char k:s.toCharArray()) set.add(k);
        return set.size()==s.length();
    }
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        int len = s.length();
        String temp = "";
        for(int i=0;i<=len-3;i++){
            temp = s.substring(i,i+3);
            //System.out.println("temp:"+temp);
            if(isGood(temp)) cnt++;
        }
        return cnt;
    }
}