class Solution {
    public boolean check(int n){
        while(n>0){
            if(n%10==0){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-1;
        while(!check(a)||!check(b)) {
            a=a+1;
            b=b-1;
        }
        return new int[]{a,b};
    }
}