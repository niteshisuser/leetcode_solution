class Solution {
    public List<Integer> lexicalOrder(int n) {
        String ans[] = new String[n+1];
        int index = 0;
        for(int i=0;i<=n;i++) ans[i]=(i+"");
        Arrays.sort(ans);
        List<Integer> aa = new ArrayList();
        for(String i:ans) if(!i.equals("0")) aa.add(Integer.parseInt(i));
        return aa;
        

    }
}