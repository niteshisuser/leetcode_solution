class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        if(n==2) {
            return Math.max(nums[0], nums[1]);
        }
        int t[] = new int[n+1];
        Arrays.fill(t, -1);
        int taken = recur(nums, 0, n-2, t);
        Arrays.fill(t, -1);
        int notTaken = recur(nums, 1, n-1, t);
        return Math.max(taken , notTaken);
    }

    private int recur(int nums[], int i, int n, int t[]) {
        if(i > n) {
            return 0;
        }
        if(t[i] != -1) {
            return t[i];
        }
        int take = nums[i] + recur(nums, i+2, n, t);
        int skip = recur(nums, i+1, n, t);
        t[i] = Math.max(take, skip);
        return t[i];
    }
}