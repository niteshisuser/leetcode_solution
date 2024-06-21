class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        StringBuilder str = new StringBuilder(number);
        StringBuilder max = new StringBuilder();
        for(int i=0;i<n;i++){
            StringBuilder s = new StringBuilder(str);
            if(digit == str.charAt(i)){
                str.deleteCharAt(i);
                if(max.length() == 0){
                    max=str;
                }
                else{
                    max = findgreat(str,max);
                }
            }
            str=s;
        }
        return max.toString();
    }
    public StringBuilder findgreat(StringBuilder a,StringBuilder b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) > b.charAt(i)){
                return a;
            }
            if(a.charAt(i) < b.charAt(i)){
                return b;
            }
        }
        return a;
    }
}