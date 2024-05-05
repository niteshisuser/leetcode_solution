class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        var sum = 0;
        for (var i = 0; i < nums.length; ++i) {
            var num = nums[i];
            var max = 0;
            var digits = 0;
            while (num > 0) {
                max = Math.max(max, num % 10);
                num /= 10;
                digits = digits * 10 + 1;
            }
            sum += digits * max;
        }
        return sum;
    }
}  