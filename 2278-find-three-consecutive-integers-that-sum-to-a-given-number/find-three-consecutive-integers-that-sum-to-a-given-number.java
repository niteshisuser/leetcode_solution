class Solution {
    public long[] sumOfThree(long num) {
        long [] ans = new long[0];
        if(num%3==0){
            ans = new long[3];
            ans[0]= num/3-1;
            ans[1] = num/3;
            ans[2] = num/3+1;
        }
        return ans;
    }
}