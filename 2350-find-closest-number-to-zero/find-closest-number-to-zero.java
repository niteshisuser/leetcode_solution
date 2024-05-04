class Solution {
    public int findClosestNumber(int[] nums) {
         Set<Integer> ans = new TreeSet();
         for(int i:nums)
            ans.add(i);
        if(ans.contains(0)) return 0;
        int max = 100000;
        for(int i=1;i<=max;i++){
            if(ans.contains(i) && ans.contains(i*-1)) return i;
            if(ans.contains(i)) return i;
            if(ans.contains(i*-1)) return i*-1;
        }
        return -1;
    }
}