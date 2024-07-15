// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1321426181/
public class DAY5_bestTimeToSell {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else if(prices[i]-buy >profit) {
                profit = prices[i]-buy;

            }
            
        }
        return profit;
    }
}
