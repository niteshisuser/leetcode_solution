class Solution {
    int gcd(int a,int b){
        //System.out.println("a:"+a+",and b:"+b);
        if (a == 0)
            return b;
 
        return gcd(b % a, a);
    }
    public int findGCD(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for(int i:nums){
            if(i>max) max=i;
            if(i<min) min = i;
        }
        return gcd(max,min);
    }
}