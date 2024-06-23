class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums) map.put(i,map.containsKey(i)?1+map.get(i):1);
        int cEven = 0,cOdd=0;
        for(int i:map.keySet()){
            if(map.get(i)>2) return false;
            else cOdd++;
        }
        return true;
    }
}