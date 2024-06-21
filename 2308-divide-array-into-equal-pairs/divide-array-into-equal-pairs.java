class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums) map.put(i,map.containsKey(i)?1+map.get(i):1);
        for(int i:map.keySet())
            if(map.get(i)%2!=0)
                return false;
            
        return true;
    }
}