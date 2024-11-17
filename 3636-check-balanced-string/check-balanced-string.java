class Solution {
    public boolean isBalanced(String num) {
        int oddSum=0,evenSum = 0;
        for(int i=0;i<num.length();i+=2){
            oddSum += Integer.parseInt((num.charAt(i)+""));
            if((i+1)<num.length()) evenSum += Integer.parseInt((num.charAt(i+1)+""));
            //num /=100;
        }
        //System.out.println("oddSum = " + oddSum + " ,and evenSum = " + evenSum);
        return oddSum == evenSum;
    }
}