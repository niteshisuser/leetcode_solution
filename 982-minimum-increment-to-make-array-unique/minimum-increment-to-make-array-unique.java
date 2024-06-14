class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        //STEP1:Keep unique value in set
        //STEP2:Remove from the list
        //STEP3:Try to set the next value which is not in the set

        /*
            3,2,1,2,1,7
            1,1,2,2,3,7
            1,2,3,7

            1,2
            4,5
            2+3

        */
        int numTracker = 0; // Tracks the next unique number that should be set.
        int minIncrement = 0; // Counts the total increments required.

        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            minIncrement += numTracker - num;
            numTracker += 1; // Increment the tracker for the next number.
        }

        return minIncrement;
    }
}