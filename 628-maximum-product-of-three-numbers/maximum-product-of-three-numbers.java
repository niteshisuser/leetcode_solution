class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int num=0, num1=0;
        int s = nums.length;
        num = nums[0]*nums[1]*nums[s-1];
        num1 = nums[s-1]*nums[s-2]*nums[s-3];
        return Math.max(num,num1);

    }
}