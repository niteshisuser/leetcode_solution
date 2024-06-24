class Solution {
    public int matrixSum(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }

        PriorityQueue<Integer> pq;
        int total = 0;
        for(int i=nums[0].length-1;i>=0;i--){
            pq = new PriorityQueue(Collections.reverseOrder());
            for(int j=nums.length-1;j>=0;j--){
                pq.add(nums[j][i]);
            }
            //System.out.println(pq);
            total += pq.poll();
        }
        return total;
    }
}