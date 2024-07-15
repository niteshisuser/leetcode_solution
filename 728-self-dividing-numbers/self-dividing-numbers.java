class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDrivingNumber(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isSelfDrivingNumber(int num) {
        int curNum = num;
        while (curNum > 0) {
            int curDigit = curNum % 10;
            if (curDigit == 0 || num % curDigit != 0) {
                return false;
            }
            curNum /= 10;
        }
        return true;
    }
}