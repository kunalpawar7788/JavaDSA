package com.kunal;
public class BestTimeToTradeStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(bestStock(prices));
    }
    public static int bestStock(int[] prices) {
        if (prices.length == 1)
            return 0;

        int minBuy = prices[0];
        int maxProfit = 0;
        int profit;

        for (int price: prices) {
            minBuy = Math.min(minBuy,price);
            profit = price - minBuy;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
