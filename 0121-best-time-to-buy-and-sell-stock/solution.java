class Solution {
    public int maxProfit(int[] prices) {
    int buy=prices[0],sell=0;
    for(int i=1;i<prices.length;i++){
        if(buy>prices[i])buy=prices[i];
        if(sell<prices[i]-buy)sell=prices[i]-buy;
    }
    return sell;
    }
}
