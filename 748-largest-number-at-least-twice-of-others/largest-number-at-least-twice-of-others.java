class Solution {
    public int dominantIndex(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i]) )
                map.put(nums[i],i);
        }
        Arrays.sort(nums);
        if(nums[n-2]*2<=nums[n-1]){
            return map.get(nums[n-1]);
        }
        else return -1;
    }
}