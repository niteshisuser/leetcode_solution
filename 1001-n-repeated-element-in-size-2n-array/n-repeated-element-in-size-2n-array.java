class Solution {
    public int repeatedNTimes(int[] nums) {
        int a[] = new int[10001];
         
        for(int i:nums){
            a[i]++;
            if(a[i]>1)
                return i;
        }
       // return -1;
            
        
        return -1;
    }
}