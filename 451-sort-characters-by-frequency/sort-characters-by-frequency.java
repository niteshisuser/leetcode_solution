class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> map = new HashMap();
       for(char k:s.toCharArray()) map.put(k,map.containsKey(k)?1+map.get(k):1);
       List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
	   list.sort(Map.Entry.comparingByValue());
       StringBuilder sb = new StringBuilder();
       list.forEach((fruit)->{
        for(int i=0;i<fruit.getValue();i++)
            sb.append(fruit.getKey());
    }
    );
       return sb.reverse().toString();
	}
}