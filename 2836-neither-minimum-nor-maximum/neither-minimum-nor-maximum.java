class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i:nums){
            if(i>max) max=i; else ans=i;
            if(i<min) min=i; else ans = i;
            ans = i;
        }
        if(ans!=min && ans!=max) return ans;
        for(int i:nums)
            if(i!=min && i!=max) 
                return i;
        
        return -1;
    }
}