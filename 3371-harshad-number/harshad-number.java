class Solution {
    int sumOfDigit(int n){
        if(n<=9) return n;
        int ds = 0;
        while(n>0){
            ds += n%10;
            n /= 10;
        }
        return ds;
    }

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        //if(x==1 || x==10) return 1;
        int digitSum = sumOfDigit(x);
        //if(digitSum==1) return -1;
        return x%digitSum==0?digitSum:-1;
    }
}