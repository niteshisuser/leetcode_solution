class Solution {
    public int[] separateDigits(int[] nums) {
        
        int size = 0;
        for (int i : nums) {
            while (i > 0) {
                size++;
                i /= 10;
            }
        }

        int[] arr = new int[size];
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp > 0) {
                arr[--size] = temp % 10;
                temp /= 10;
            }
        }
        return arr;
    }
}
