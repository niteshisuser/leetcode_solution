class Solution {
    int getDigitSum(int n){
        if(n<=9) return n;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    boolean isSymmetric(String n){
        int firstHalf = getDigitSum(Integer.parseInt(n.substring(0,n.length()/2)));
        int secondHalf = getDigitSum(Integer.parseInt(n.substring(n.length()/2)));
        return firstHalf==secondHalf;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            String num = i+"";
            if(num.length()%2==0 && isSymmetric(num)) 
                count ++;
        }
        return count;
    }
}