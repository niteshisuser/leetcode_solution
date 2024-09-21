class Solution {
    public int minOperations(int[] nums, int k) {
        /**
        2,11,10,1,3
        1,2,3,10,11
         */
        //Arrays.sort(nums);
        int count = 0;
        for(int i:nums){
            if(i<k) count++;
        }
        return count;
    }
}