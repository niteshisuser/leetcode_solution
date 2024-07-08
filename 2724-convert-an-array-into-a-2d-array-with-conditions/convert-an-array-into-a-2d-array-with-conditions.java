class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();

       Map<Integer, Integer> map = new LinkedHashMap<>();
       for(int i=0; i<nums.length; i++) {
           if(!map.containsKey(nums[i])) {
               map.put(nums[i], 1);
           } else {
               map.put(nums[i], map.get(nums[i])+1);
           } 
       }
       int maxRowCount = 0;
       for(Integer key: map.keySet()) {
           maxRowCount = Math.max(maxRowCount, map.get(key));
       }

       while(maxRowCount-->0) {
           List<Integer> list = new ArrayList<>();
           result.add(list);
       }

       map.clear();      
       
       for(int i=0; i<nums.length; i++) {
           if(!map.containsKey(nums[i])) {
               map.put(nums[i], 1);
               result.get(0).add(nums[i]);
            } else {
               map.put(nums[i], map.get(nums[i])+1);
               result.get(map.get(nums[i])-1).add(nums[i]);
            } 
        }
        return result;
    }
}