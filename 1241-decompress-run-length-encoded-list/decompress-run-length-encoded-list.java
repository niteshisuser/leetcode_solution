class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();
        int n = nums.length;
        for(int i=0;i<n;i+=2)
            for(int j=0;j<nums[i];j++)
                list.add(nums[i+1]);
        
        int[] arr = new int[list.size()];
        int index = 0;
        for(int i:list) arr[index++]=i;
        return arr;
    }
}