class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n-3;i++)
            for(int j=i+1;j<n-2;j++)
                for(int k=j+1;k<n-1;k++)
                    for(int kk=k+1;kk<n;kk++)
                    if(nums[i]+nums[j]+nums[k]==nums[kk])
                        count ++;
        
        return count;


    }
}