class Solution {
    public int findDuplicate(int[] nums) {
        int a[] = new int [100001];
        for(int i:nums){
            a[i]++;
            if(a[i]>=2) return i;
        }
        return 0;
    }
}