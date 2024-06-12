class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zero=0,one=0,two=0;
        for(int i:nums){
            switch(i){
                case 0: zero++; break;
                case 1: one++; break;
                case 2: two++; break;
            }
        }
        for(int i=0;i<n;i++){
            if(zero-->0) nums[i]=0;
            else if(one-->0) nums[i]=1;
            else nums[i]=2;
        }

    }
}