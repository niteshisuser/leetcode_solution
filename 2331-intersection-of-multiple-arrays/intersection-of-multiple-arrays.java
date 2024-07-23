class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[]map = new int[1001];
        List<Integer> ans = new ArrayList();
        for(int a[]:nums){
            for(int i:a)
                map[i]++;
        }
        int n = nums.length;
        for(int i=1;i<1001;i++) 
            if(map[i]==n) ans.add(i);
        return ans;
    }
}