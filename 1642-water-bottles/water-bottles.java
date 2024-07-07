class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles; //We can drink all what we have
        int temp = 0; 
        while(true){ 
            temp = numBottles; //after drinking, Remember how much bottle we have now
            numBottles/=numExchange; //Exchanges now and now that can be drink as well, so add it
            total += numBottles;
            //Now check if any bottle is left which can't be exchange
            numBottles += (temp%numExchange);

            //If we have less bottle, than exchange stop, since we can't process further
            if(numBottles<numExchange) break;
        }
        return total;
    }
}