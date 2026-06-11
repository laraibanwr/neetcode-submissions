class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        for(int price : prices) {
            if(price > buy) {
                int profit = price - buy;
                maxProfit = Math.max(profit, maxProfit);
            }
            else {
                buy = price;
            }
        }
        return maxProfit;
    }
}
