class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int []map = new int[101];
        for(int i:nums) {
            map[i]++;
            if(map[i]>2) return false;
        }

        for(int i:map)
            if(i>2) return false;
        return true;
    }
}