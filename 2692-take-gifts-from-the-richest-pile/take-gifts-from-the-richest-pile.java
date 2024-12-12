class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue(Collections.reverseOrder());
        for(int g:gifts)
            q.add(g);
        
        for(int i=0;i<k;i++)
            q.add((int)(Math.sqrt(q.poll())));
        
        long ans = 0;
        while(q.size()!=0){
            ans += q.poll();
        }
        return ans;

    }
}