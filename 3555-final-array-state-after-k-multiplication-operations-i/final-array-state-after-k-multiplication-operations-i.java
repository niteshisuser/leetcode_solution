class Solution {
     
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            // Find the index of the minimum value
            int minIndex = findMinIndex(nums);
            // Update the value at that index
            nums[minIndex] *= multiplier;
        }
        return nums;
    }

    private static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}