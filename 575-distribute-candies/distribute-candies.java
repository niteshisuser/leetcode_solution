class Solution {
    public int distributeCandies(int[] candyType) {
        int count = candyType.length;
        Set<Integer> set = new HashSet();
        for(int i:candyType) set.add(i);
        return set.size()>=(count/2)?count/2:set.size();
    }
}