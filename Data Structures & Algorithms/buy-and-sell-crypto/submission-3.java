class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1;
        int maxProfit = 0;
        while(sell < prices.length) {
            if(prices[sell] < prices[buy]) {
                buy = sell;
            }
            else {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            }
            sell++;
        }
        return maxProfit;
    }
}
