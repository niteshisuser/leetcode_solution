class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int maxValue = values[0];
        
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxValue + values[j] - j);
            maxValue = Math.max(maxValue, values[j] + j);
        }
        return maxScore;
    }
}