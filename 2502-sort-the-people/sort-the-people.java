class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap();
        int n = names.length;
        for(int i=0;i<n;i++) map.put(heights[i],names[i]);
        String [] sorted = new String[n];
        int index = n-1;
        for(int i:map.keySet()) sorted[index--]=map.get(i);
        return sorted;
    }
}