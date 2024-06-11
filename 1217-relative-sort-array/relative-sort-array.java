class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new TreeMap();
        for(int i:arr1) map.put(i,map.containsKey(i)?1+map.get(i):1);
        int index = 0;
        for(int i:arr2){
            if(map.containsKey(i)){
                for(int j=0;j<map.get(i);j++){
                    arr1[index++] = i;
                }
            }
            map.remove(i);
        }
        for(int i:map.keySet()){
            for(int j=0;j<map.get(i);j++){
                    arr1[index++] = i;
                }
        }
        return arr1;
    }
}