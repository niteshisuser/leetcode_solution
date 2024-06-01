class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        int n = 0;
        for(String s:strs){
            try{
                n = Integer.parseInt(s);
                
            }
            catch(Exception e){
                n = s.length();

            }
            if(n>max) max = n;
        }
        return max;
    }
}