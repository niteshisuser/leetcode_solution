class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            
             sum = (sum * 2 + nums[i]) % 5;
           list.add(sum==0);
        }
        return list;
    }
}