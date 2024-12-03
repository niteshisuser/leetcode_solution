class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        int spaceLen = spaces.length;
        int spaceIndex = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            if(spaceIndex<spaceLen && i==spaces[spaceIndex]){
                ans.append(" ");
                spaceIndex++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}