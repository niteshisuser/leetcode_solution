class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        Set<Integer> hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        List<Integer> ls=new ArrayList<>(hs);
        Collections.sort(ls);

        Map<Integer,Integer> hm=new HashMap<>();
        int rank=1;
        for(int num : ls){
            hm.put(num,rank++);
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=hm.get(arr[i]);
        }

        return ans;
    }
}