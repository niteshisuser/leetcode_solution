class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
            for (int i=0; i<code.length; i++){
                code[i]=0;
            }
            return code;
        }
        int ans []=new int[code.length];
        int n = code.length;
        int sum=0;
        if(k>0){
            int count = 0;
            int i=0;
            while(count<k){
                sum+=code[i];
                i = (i+1)%n;
                count++;
            }
            for(int j=0; j<n; j++){
                sum = sum-code[j]+code[(k+j)%n];
                ans[j] = sum;
            }
            return ans;
        }
        int idx=n-Math.abs(k);
        for(int j=idx; j<n;j++){
            sum+=code[j];
        }
        ans[0]=sum;
        for(int i=1; i<n; i++){
            sum=sum-code[idx]+code[i-1];
            ans[i]=sum;
            idx=(idx+1)%n;
        }
        return ans;
    }
}