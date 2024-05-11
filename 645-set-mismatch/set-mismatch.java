class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int ans[] = new int[2];
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])
            {
                ans[0] = nums[i];
            }
            else sum+=nums[i];
        }
        //System.out.println("TotalSum:"+totalSum +",curSum:"+sum);
         ans[1]= totalSum - sum;
        
        return ans;
    }
}