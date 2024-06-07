class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        //Arrays.sort(words);
        //for(String w:words) System.out.print(w + " ");
        Map<String,Integer> map = new HashMap();
        for(String w:words) {
            char t[] = w.toCharArray();
            Arrays.sort(t);
            w=new String(t);
            map.put(w,map.containsKey(w)?1+map.get(w):1);
        }
        int count = 0;
        for(String key:map.keySet()) if(map.get(key)>1) count++;
        return count;
    }
}