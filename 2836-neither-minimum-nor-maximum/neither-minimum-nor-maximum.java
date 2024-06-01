class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        for(int i:nums)
            if(i!=min && i!=max) 
                return i;
        
        return -1;
    }
}