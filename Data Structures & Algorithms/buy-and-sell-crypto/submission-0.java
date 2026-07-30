class Solution {
    public int maxProfit(int[] prices) {
        // prices[i] - $ of NeetCoin on ith day
        // choose a day to BUY
        // choose a diff day to SELL
        // ret max profit
        // also choose to make NO transactions (profit == 0)
        // find MAX and then compare all txns prior days (buy)
        int buyDay = 0;
        int sellDay = 1;
        int maxProfit = 0;

        // while the sellDay is within the max days
        while (sellDay < prices.length) {
            // if the buyDay price is less than the sellDay price
            if (prices[buyDay] < prices[sellDay]) {
                // if yes, then the profit is compare with the current max
                // and that max is taken as the new/curr profit
                maxProfit = Math.max(maxProfit, prices[sellDay] - prices[buyDay]);
            } else {
                // if the buy day price is not lower than the sellDay price, 
                // then we change the buyDay to be the sellDay
                buyDay = sellDay;
            }

            // in both scenarios we will increment the sellDay
            sellDay++;
        }

        return maxProfit;
    }
}
