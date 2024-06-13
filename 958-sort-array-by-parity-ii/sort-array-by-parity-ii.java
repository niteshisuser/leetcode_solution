class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        /*
            4,2,5,7

        */
        int n = nums.length;
        int a[] = new int[n];
        int oddIndex = 1;
        int evenIndex = 0;
        for(int i:nums){
            if(i%2==0) 
            {
                a[evenIndex]=i;
                evenIndex +=2;
            }
            else {
                a[oddIndex]=i;
                oddIndex +=2;
            }
        }
        return a;
    }
}