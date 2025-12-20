// Buy & Sell Stocks (Single transaction)

public class BuyAndSellStocks {

    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // update min buy price
            buyPrice = Math.min(buyPrice, prices[i]);

            // calculate profit
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit = " + maxProfit(prices));
    }
}