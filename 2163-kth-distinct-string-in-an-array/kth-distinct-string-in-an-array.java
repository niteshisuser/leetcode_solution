class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new LinkedHashMap();
        for(String a:arr )
            map.put(a,map.containsKey(a)?1+map.get(a):1);
        
        int index = 0;
        for(String s:map.keySet()){
            if(map.get(s)==1) {
                index ++;
                if(index==k)
                    return s;
            }
              
        }
        return "";
    }
}