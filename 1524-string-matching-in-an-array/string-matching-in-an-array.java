class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList();
        int w = words.length;
        for(int i=0;i<w;i++){
            for(int j=0;j<w;j++){
                if(i!=j && words[i].indexOf(words[j])>=0)
                    if(!ans.contains(words[j]))
                        ans.add(words[j]);
            }
        }
        return ans;
    }
}