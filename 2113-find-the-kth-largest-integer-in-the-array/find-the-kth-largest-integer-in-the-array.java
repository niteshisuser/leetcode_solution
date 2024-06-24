import java.math.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq = new PriorityQueue(Collections.reverseOrder());
        for(String i:nums) pq.add(new BigInteger(i));
        while(k -- >1) pq.poll();
        return pq.poll().toString();


    }
}