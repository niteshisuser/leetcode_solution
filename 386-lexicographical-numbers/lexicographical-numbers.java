class Solution {
    public List<Integer> lexicalOrder(int n) {
        Set<String> set = new TreeSet();
        Set<Integer> s = new LinkedHashSet();
        for(int i=1;i<=n;i++) set.add(""+i);
        for(String ss:set)
            s.add(Integer.parseInt(ss));
        return new ArrayList(s);
        

    }
}