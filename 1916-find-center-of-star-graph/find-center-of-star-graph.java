class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map = new HashMap();
        int a=0,b=0;
        for(int e[]:edges){
            a = e[0];
            b = e[1];
            map.put(a,map.containsKey(a)?1+map.get(a):1);
            map.put(b,map.containsKey(b)?1+map.get(b):1);
        }
        int max = 0;
        int key = -1;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
                key = i;
            }
        }
        return key;
    }
}