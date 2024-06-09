class Solution {
    int dsum(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10);
            n /=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int i:nums){
            sum += i;
            digitSum += dsum(i);
        }
        return (int)(Math.abs(digitSum-sum));
    }
}