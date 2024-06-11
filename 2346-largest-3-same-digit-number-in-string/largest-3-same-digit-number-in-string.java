class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int max = -1;
        int temp =0;
        String maxString = "";
        String tempString="";
        for(int i=0;i<=n-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                tempString = num.substring(i,i+3);
                temp = Integer.parseInt(tempString);
                if(temp>max) {
                    max=temp;
                    maxString = tempString;
                }
            }
        }
        if(temp>max) {
                    max=temp;
                    maxString = tempString;
                }
        return maxString;
    }
}