class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map = new TreeMap();
        for(int A[]:nums1)
            map.put(A[0],map.containsKey(A[0])?map.get(A[0])+A[1]:A[1]);
        for(int A[]:nums2)
            map.put(A[0],map.containsKey(A[0])?map.get(A[0])+A[1]:A[1]);
        Set<Integer> keys = map.keySet();
        int keyCount = keys.size();
        int ans[][] = new int[keyCount][2];
        int index = 0;
        for(int k:keys){
            ans[index][0] = k;
            ans[index++][1] = map.get(k);
        }
        return ans;
    }
}