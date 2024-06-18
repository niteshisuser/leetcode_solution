class Solution {
    List<Integer> GetUpdated(List<Integer> list){
        List<Integer> ans = new ArrayList();
        int n = list.size();
        for(int i=1;i<n;i++)   ans.add((list.get(i)+list.get(i-1))%10);
        return ans;
    }

    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> ans = new ArrayList();
        for(int i=1;i<nums.length;i++)
            ans.add((nums[i]+nums[i-1])%10);
        //System.out.println("Ans:"+ans);
        while(ans.size()!=1){
            ans = GetUpdated(ans);
            //System.out.println("Ans:"+ans);
        }
        return ans.get(0);
    }
}