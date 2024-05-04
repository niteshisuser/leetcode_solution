class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        if(Integer.parseInt(num.charAt(len-1)+"")%2!=0) return num;
        int index = num.length()-1;

        int rem = 0;
        while(index>=0){
            //rem = Integer.parseInt(num.charAt(index)+"")%2!=0;
            if(Integer.parseInt(num.charAt(index)+"")%2!=0)
                return num.substring(0,index+1);
            index --;
        }
        return "";
    }
}