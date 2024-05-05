class Solution {
    public int[] numberGame(int[] nums) {
        /*
        5 4 2 3 
        2 3 4 5
        3 2 5 4
        */
        Arrays.sort(nums);
        int n = nums.length;
        int ans[] = new int[n];
        int index = 0;
        for(int i=1;i<n;i+=2){
            ans[index++] = nums[i];
            ans[index++] = nums[i-1];
        }
        return ans;
    }
}