class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long happinessCount = 0;
        int h = happiness.length;
        Arrays.sort(happiness);
        int temp = 0;
        int cur = 0;
        for(int i=0;i<k;i++){
            temp =  happiness[h-1-i]-cur;
            System.out.println("Cur Happiness:"+temp);
            cur++;
            if(temp>0) happinessCount +=temp;
        }
        return happinessCount;
    }
}