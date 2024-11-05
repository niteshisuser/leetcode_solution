class Solution {
    public int fillCups(int[] amount) {
        /*
        q ->1,4,2->4,2,1
        */
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i:amount)
            if(i!=0) 
                pq.add(i);
        int steps =0;
        int temp1=0,temp2=0;
        while(pq.size()!=0){
           temp1 = pq.poll();
           if(pq.size()!=0) temp2 = pq.poll();
            steps ++;
            if(temp1-1>0) pq.add(temp1-1);
            if(temp2-1>0) pq.add(temp2-1);
        }
        return steps;
 
    }
}