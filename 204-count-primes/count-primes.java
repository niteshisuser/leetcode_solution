class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i=1;i<=n;i++)
            prime[i] = true;
        for(int i=2;i*i<=n;i++)
            if(prime[i])
                for(int k = i*i;k<=n;k+=i) prime[k] = false;
        int count = 0;
        for(int i=2;i<n;i++) count += prime[i]?1:0;
        return count;
                
    }
}