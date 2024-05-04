class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-","");
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int index = 0;
        for(int i=n-1;i>=0;i--){
             sb.insert(0,""+Character.toUpperCase(s.charAt(i)));
                if((index+1)==k && i!=0){
                    sb.insert(0,"-");
                    index = 0;
                }
                else index ++;
        }
        return sb.toString();
    }
}