class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10 == 0){
            return 100-purchaseAmount;
        }
        int ans=100-purchaseAmount;
        return purchaseAmount%10 >= 5 ? (ans/10)*10 : ((ans/10)+1)*10;
    }
}