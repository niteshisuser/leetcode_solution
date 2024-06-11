class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> ls = new ArrayList<>(hm.entrySet());
        Collections.sort(ls,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                int compare=o1.getValue().compareTo(o2.getValue());
                if(compare==0){
                    compare=o2.getKey().compareTo(o1.getKey());
                }
                return compare;
            }
        });
        int x=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<ls.size();i++){
            Map.Entry<Integer,Integer> e=ls.get(i);
            int val=e.getKey();
            int freq=e.getValue();
            for(int j=0;j<freq;j++){
                ans[x++]=val;
            }
        }
        return ans;
    }
}