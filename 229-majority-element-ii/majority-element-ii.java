class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
            map.put(i,map.containsKey(i)?1+map.get(i):1);
        for(int i:map.keySet())
            if(map.get(i)>n/3) ans.add(i);
        return ans;
            
    }
}