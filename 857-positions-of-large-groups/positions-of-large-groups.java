class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list;
        int startIndex = 0;
        int endIndex = 0;
        int n = s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                endIndex = i;
            }
            else {
                int diff = endIndex-startIndex+1;
                if(diff>=3){
                    list = new ArrayList();
                    list.add(startIndex);
                    list.add(endIndex);
                    ans.add(list);
                }
                startIndex=endIndex = i;
            }
        }
        int diff = endIndex-startIndex+1;
        if(diff>=3){
            list = new ArrayList();
            list.add(startIndex);
            list.add(endIndex);
            ans.add(list);
        }
        return ans;

    }
}