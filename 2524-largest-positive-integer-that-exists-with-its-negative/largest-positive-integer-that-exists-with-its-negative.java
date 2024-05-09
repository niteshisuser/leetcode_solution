class Solution {
    public int findMaxK(int[] nums) {
        int n = 1001;
        int pos[]= new int[n];
        int neg[]= new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pos[nums[i]]++;
            else neg[-1*nums[i]]++;      
        }
        System.out.println("PRINING");
        for(int i:pos) if(i>0)System.out.print(i + " ");
        System.out.println();
        for(int i:neg) if(i>0) System.out.print(i + " ");
        for(int i=n-1;i>=1;i--){
            if(pos[i]>0 && neg[i]>0) return i;
        }
        return -1;
    
    }
}