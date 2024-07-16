class Solution {
    public int[] sumZero(int n) {
        int ans[]= new int[n];
        int start=1;
        int index = 0;
        if(n%2!=0){
            ans[0]=0;
            index=1;
        }
        for(;index<n-1;index+=2){
            ans[index]=start;
            ans[index+1]=start*-1;
            start ++;
        }
        return ans;

    }
}